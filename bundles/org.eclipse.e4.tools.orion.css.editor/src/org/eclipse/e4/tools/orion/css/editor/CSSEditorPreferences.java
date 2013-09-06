package org.eclipse.e4.tools.orion.css.editor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.ui.css.swt.internal.theme.ThemeEngine;
import org.eclipse.e4.ui.css.swt.theme.ITheme;
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.tweaklets.PreferencePageEnhancer;
import org.osgi.framework.Bundle;

public class CSSEditorPreferences extends PreferencePageEnhancer {

	ITheme selection;
	IThemeEngine engine;
	boolean resetCurrentTheme;
	private Browser browser;
	private String editorHtml;
	private String editorContent;
	private Path filePath;

	@SuppressWarnings("restriction")
	@Override
	public void createContents(Composite parent) {
		resetCurrentTheme = false;
		IWorkbenchWindow wbw = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		MWindow hostWin = (MWindow) wbw.getService(MWindow.class);
		EPartService partService = hostWin.getContext().get(EPartService.class);
		EModelService modelService = hostWin.getContext().get(
				EModelService.class);

		engine = hostWin.getContext().get(IThemeEngine.class);

		try {
			initContent();

			loadEditorHtml();

			// Render it
			Composite composite3 = new Composite(parent, SWT.BORDER);
			composite3.setLayout(new FillLayout());
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 2);
			data.widthHint = 500;
			data.heightHint = 500;
			composite3.setLayoutData(data);

			browser = new Browser(composite3, SWT.NONE);
			browser.setText(editorHtml, true);
		} catch (IOException e) {
			Activator
					.getDefault()
					.getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							"Failed to load CSS", e));
			return;
		}
	}

	private void loadEditorHtml() throws IOException {
		final Bundle bundle = Activator.getDefault().getBundle();
		final InputStream contentAssistInput = bundle.getEntry(
				"/web/swtContentAssist.js").openStream();
		String contentAssistTemplate = loadFile(contentAssistInput, 1024);
		String keywords = loadKeywords();
		String contentAssist = String.format(contentAssistTemplate, keywords);
		final InputStream cssTemplateInput = bundle.getEntry("/web/css.html")
				.openStream();
		String cssTemplate = loadFile(cssTemplateInput, 1024);
		final String editorCssUrl = FileLocator.toFileURL(
				bundle.getEntry("/web/built-editor.css")).toExternalForm();
		final String editorJsUrl = FileLocator.toFileURL(
				bundle.getEntry("/web/built-editor.js")).toExternalForm();

		editorHtml = String.format(cssTemplate, editorCssUrl, editorJsUrl,
				contentAssist, editorContent);
	}

	private void initContent() throws MalformedURLException, IOException {
		final ITheme theme = selection;
		List<String> sheets = ((ThemeEngine) engine).getStylesheets(theme);
		List<String> mod = ((ThemeEngine) engine)
				.getModifiedStylesheets(selection);
		if (mod.size() > 0) {
			sheets = mod;
		}
		if (sheets.size() > 0) {
			String path = sheets.get(0);
			URL fileURL = FileLocator.toFileURL(new URL(path));
			final InputStream in = fileURL.openStream();
			filePath = new Path(fileURL.getPath());
			editorContent = loadFile(in, 1024);
		} else {
			editorContent = "/*\n * This is an Orion editor sample.\n */\nfunction() {\n    var a = 'hi there!';\n    window.console.log(a);\n}";
		}
	}

	private String loadKeywords() {
		StringBuilder buf = new StringBuilder();

		IExtensionRegistry registry = RegistryFactory.getRegistry();
		IExtensionPoint extPoint = registry
				.getExtensionPoint("org.eclipse.e4.ui.css.core.propertyHandler");
		ArrayList<IConfigurationElement> matchingElements = new ArrayList<IConfigurationElement>();
		ArrayList<IConfigurationElement> controlAdapters = new ArrayList<IConfigurationElement>();
		for (IExtension e : extPoint.getExtensions()) {
			IConfigurationElement[] elements = e.getConfigurationElements();
			for (int i = 0; i < elements.length; i++) {
				IConfigurationElement element = elements[i];
				controlAdapters.add(element);
				IConfigurationElement[] child = element
						.getChildren("property-name");
				for (int j = 0; j < child.length; j++) {
					matchingElements.add(child[j]);
				}
			}
		}
		Iterator<IConfigurationElement> iter = matchingElements.iterator();
		boolean once = true;
		while (iter.hasNext()) {
			IConfigurationElement type = iter.next();
			String name = type.getAttribute("name");
			if (!once) {
				buf.append(',');
				buf.append('\n');
			}
			buf.append('"');
			buf.append(name);
			buf.append('"');
			once = false;
		}
		buf.append('\n');

		return buf.toString();
	}

	public String loadFile(final InputStream in, final int bufferSize)
			throws IOException {
		final char[] buffer = new char[bufferSize];
		final StringBuilder out = new StringBuilder();
		final Reader reader = new InputStreamReader(in, "UTF-8");
		try {
			int size = reader.read(buffer, 0, buffer.length);
			while (size > 0) {
				out.append(buffer, 0, size);
				size = reader.read(buffer, 0, buffer.length);
			}
		} finally {
			reader.close();
		}
		return out.toString();
	}

	@Override
	public void setSelection(Object sel) {
		if (sel instanceof ITheme) {
			ITheme newTheme = (ITheme) sel;
			ITheme oldSelection = selection;
			selection = newTheme;
			if (oldSelection != null
					&& !newTheme.getId().equals(oldSelection.getId())) {
				try {
					initContent();
					loadEditorHtml();
					browser.setText(editorHtml, true);
				} catch (IOException e) {
					Activator
							.getDefault()
							.getLog()
							.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
									"Failed to load CSS", e));
					return;
				}
			}
		}

	}

	private boolean isDirty() {
		final Object rc = browser.evaluate("return window.editor.isDirty();");
		if (rc instanceof Boolean) {
			return (Boolean) rc;
		}
		return false;
	}

	@Override
	public void performOK() {

		if (isDirty()) {
			// check for .e4css folder
			Location configLocation = Platform.getConfigurationLocation();
			String e4CSSPath = null;
			try {
				URL locationURL = new URL(configLocation.getDataArea(
						ThemeEngine.THEME_PLUGIN_ID).toString());
				File locationFile = new File(locationURL.getFile());
				e4CSSPath = locationFile.getPath();
				if (!locationFile.exists()) {
					locationFile.mkdirs();
				}
			} catch (IOException e1) {
				Activator
						.getDefault()
						.getLog()
						.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
								"Failed to create config CSS", e1));
				return;
			}
			IPath path = new Path(e4CSSPath
					+ System.getProperty("file.separator")
					+ filePath.lastSegment());
			final Object rc = browser
					.evaluate("return window.editor.getText();");
			if (!(rc instanceof String)) {
				Activator
						.getDefault()
						.getLog()
						.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
								"Failed to retrieve editor content " + rc));
				return;
			}
			byte[] bytes = ((String) rc).getBytes();
			FileOutputStream outputStream = null;
			try {
				outputStream = new FileOutputStream(path.toOSString());
				outputStream.write(bytes, 0, bytes.length);
			} catch (FileNotFoundException e) {
				Activator
						.getDefault()
						.getLog()
						.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
								"Failed to write CSS", e));
			} catch (IOException e) {
				Activator
						.getDefault()
						.getLog()
						.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
								"Failed to write CSS", e));
			} finally {
				if (outputStream != null)
					try {
						outputStream.close();
					} catch (IOException e) {
					}
			}
			if (engine instanceof ThemeEngine) {
				ArrayList<String> styleSheets = new ArrayList<String>();
				try {
					URL styleSheetURL = path.toFile().toURI().toURL();
					styleSheets.add(styleSheetURL.toString());
					((ThemeEngine) engine)
							.themeModified(selection, styleSheets);
				} catch (MalformedURLException e) {
					Activator
							.getDefault()
							.getLog()
							.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
									"Failed to update CSS Theme", e));
				} catch (IOException e) {
					Activator
							.getDefault()
							.getLog()
							.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
									"Failed to update CSS Theme", e));
				}
			}
		}

		if (resetCurrentTheme) {
			((ThemeEngine) engine).resetCurrentTheme();
			resetCurrentTheme = false;
		}
	}

	@Override
	public void performCancel() {
		// Just let the text disappear
	}

	@Override
	public void performDefaults() {
		List<String> mod = ((ThemeEngine) engine)
				.getModifiedStylesheets(selection);
		if (mod.size() > 0) {

			// For now just get the first element
			String path = mod.get(0);
			try {

				URL styleSheetURL = FileLocator.toFileURL(new URL(path));
				File file = new File(styleSheetURL.getFile());
				if (file.exists())
					file.delete();
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (engine instanceof ThemeEngine) {
			((ThemeEngine) engine).resetModifiedStylesheets(selection);
		}

		try {
			initContent();
			loadEditorHtml();
			browser.setText(editorHtml, true);
		} catch (IOException e) {
			Activator
					.getDefault()
					.getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							"Failed to load CSS", e));
			return;
		}

		resetCurrentTheme = true;
	}

}
