package org.eclipse.e4.ui.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

public class CSSAntlrToAttribute extends DefaultAntlrTokenToAttributeIdMapper {
@Override
protected String calculateId(String tokenName, int tokenType) {
	if (tokenName.equals("px")) {
		return DefaultHighlightingConfiguration.KEYWORD_ID;
	}
	return super.calculateId(tokenName, tokenType);
}
}
