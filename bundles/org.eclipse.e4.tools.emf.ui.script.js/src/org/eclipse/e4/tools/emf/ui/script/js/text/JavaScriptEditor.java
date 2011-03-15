package org.eclipse.e4.tools.emf.ui.script.js.text;

import javax.inject.Inject;

import org.eclipse.e4.tools.emf.ui.script.js.ResourceProvider;
import org.eclipse.e4.tools.emf.ui.script.js.text.scanners.IJavaScriptPartitions;
import org.eclipse.e4.tools.emf.ui.script.js.text.scanners.JavaScriptSourceViewerConfiguration;
import org.eclipse.e4.tools.emf.ui.script.js.text.scanners.JavaScriptTextTools;
import org.eclipse.e4.tools.emf.ui.script.js.text.scanners.PreferenceConstants;
import org.eclipse.e4.tools.services.IResourcePool;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.VerticalRuler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class JavaScriptEditor {
	private static final int VERTICAL_RULER_WIDTH = 12;
	
	private static PreferenceStore store = new PreferenceStore();
	
	private Document document;

	private SourceViewer viewer;
	
	static {
		store.setDefault(ResourceProvider.JAVADOC_KEYWORD+PreferenceConstants.EDITOR_BOLD_SUFFIX, true);
		store.setDefault(ResourceProvider.JAVA_KEYWORD+PreferenceConstants.EDITOR_BOLD_SUFFIX, true);
		store.setDefault(ResourceProvider.JAVA_KEYWORD_RETURN+PreferenceConstants.EDITOR_BOLD_SUFFIX, true);
	}
	
	@Inject
	public JavaScriptEditor(Composite parent, IResourcePool pool) {
		this.document = new Document();
		VerticalRuler verticalRuler = new VerticalRuler(VERTICAL_RULER_WIDTH);
		
		int styles= SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION;
		viewer = new SourceViewer(parent, verticalRuler, styles);
		
		Font f = null;
		if( ! JFaceResources.getFontRegistry().hasValueFor("JavaEditorFont") ) {
			if( SWT.getPlatform().equals("carbon") || SWT.getPlatform().equals("cocoa") ) {
				JFaceResources.getFontRegistry().put("JavaEditorFont", new FontData[] {new FontData("Monaco",11,SWT.NONE)});
			}
		}
		
		f = JFaceResources.getFontRegistry().get("JavaEditorFont");
		viewer.getTextWidget().setFont(f);
		
		JavaScriptTextTools textTools = new JavaScriptTextTools(pool, store);
		viewer.configure(new JavaScriptSourceViewerConfiguration(textTools));
		
		textTools.setupJavaDocumentPartitioner(document, IJavaScriptPartitions.JAVA_PARTITIONING); 
		viewer.setDocument(document);
	}
	
	public Control getControl() {
		return viewer.getControl();
	}
	
	public String getContent() {
		return document.get();
	}
}
