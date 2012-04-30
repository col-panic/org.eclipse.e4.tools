package org.eclipse.e4.tools.css.spy;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.ui.css.core.dom.ExtendedDocumentCSS;
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.eclipse.e4.ui.css.swt.dom.WidgetElement;
import org.eclipse.e4.ui.css.swt.internal.theme.ThemeEngine;
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.w3c.css.sac.CSSParseException;
import org.w3c.dom.stylesheets.StyleSheet;
import org.w3c.dom.stylesheets.StyleSheetList;

public class CSSScratchPadWindow extends Dialog {

	private IThemeEngine themeEngine;

	public CSSScratchPadWindow(Shell parentShell, IThemeEngine themeEngine) {
		super(parentShell);
		this.themeEngine = themeEngine;
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE/* | SWT.PRIMARY_MODAL */);
		// setShellStyle(SWT.DIALOG_TRIM | SWT.MAX | SWT.RESIZE
		// | getDefaultOrientation());
	}

	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("CSS Scratchpad");
	}

	private static final int APPLY_ID = IDialogConstants.OK_ID + 100;

	private Text cssText;
	private Text exceptions;

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite outer = (Composite) super.createDialogArea(parent);

		SashForm sashForm = new SashForm(outer, SWT.VERTICAL);

		cssText = new Text(sashForm, SWT.BORDER | SWT.MULTI | SWT.WRAP
				| SWT.V_SCROLL);

		exceptions = new Text(sashForm, SWT.BORDER | SWT.MULTI | SWT.READ_ONLY);

		GridDataFactory.fillDefaults().grab(true, true).applyTo(sashForm);
		sashForm.setWeights(new int[] { 80, 20 });

		return outer;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, APPLY_ID, "Apply", true);
		createButton(parent, IDialogConstants.OK_ID, "Close", false);
		// createButton(parent, IDialogConstants.CANCEL_ID,
		// IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(600, 500);
	}

	@Override
	protected void buttonPressed(int buttonId) {
		switch (buttonId) {
		case APPLY_ID:
			applyCSS();
			break;
		default:
			super.buttonPressed(buttonId);
		}
	}

	private void applyCSS() {
		long start = System.nanoTime();
		exceptions.setText("");
		CSSEngine engine = WidgetElement.getEngine(getShell().getDisplay());
		if (engine == null) {
			exceptions.setText("No CSS Engine available");
		}
		if (themeEngine != null) {
			// FIXME: expose this new protocol
			((ThemeEngine) themeEngine).resetCurrentTheme();
		}
		ExtendedDocumentCSS doc = (ExtendedDocumentCSS) engine
				.getDocumentCSS();
		List<StyleSheet> sheets = new ArrayList<StyleSheet>();
		StyleSheetList list = doc.getStyleSheets();
		for (int i = 0; i < list.getLength(); i++) {
			sheets.add(list.item(i));
		}

		try {
			Reader reader = new StringReader(cssText.getText());
			sheets.add(0, engine.parseStyleSheet(reader));
			doc.removeAllStyleSheets();
			for (StyleSheet sheet : sheets) {
				doc.addStyleSheet(sheet);
			}
			engine.reapply();

			long nanoDiff = System.nanoTime() - start;
			exceptions.setText("Total time: " + (nanoDiff / 1000000) + "ms");
		} catch (CSSParseException e) {
			exceptions.setText("Error: line " + e.getLineNumber() + " col "
					+ e.getColumnNumber() + ": " + e.getLocalizedMessage());
		} catch (IOException e) {
			exceptions.setText("Error: " + e.getLocalizedMessage());
		}
	}

}
