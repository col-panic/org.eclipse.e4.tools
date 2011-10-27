package org.eclipse.e4.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class CSSHighlightingConfiguration extends
		DefaultHighlightingConfiguration {
	
	public final static String CSS_Element = "Element"; 
	public final static String CSS_ClassID = "ClassID"; 
	public final static String CSS_Declaration = "Declaration"; 
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(CSS_Element, "Element", elementStyle());
		acceptor.acceptDefaultHighlighting(CSS_ClassID, "Class ID", classIDStyle());
		acceptor.acceptDefaultHighlighting(CSS_Declaration, "Declaration", declarationStyle());
	}
	@Override
	public TextStyle numberTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(251, 81, 4));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	public TextStyle elementStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(127, 0, 85));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	public TextStyle classIDStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(35, 177, 76));
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}
	
	public TextStyle declarationStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(92, 0, 255));
		return textStyle;
	}
}
