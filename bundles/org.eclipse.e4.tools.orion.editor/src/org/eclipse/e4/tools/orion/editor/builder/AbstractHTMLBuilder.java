/*******************************************************************************
 * Copyright (c) 2013 Angelo Zerr and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.tools.orion.editor.builder;

/**
 * Abstract class to build the Orion HTML editor.
 * 
 */
public class AbstractHTMLBuilder implements IHTMLBuilder {

	private final String html;

	public AbstractHTMLBuilder(EditorOptions options) {
		this.html = generateHTML(options);
	}

	@Override
	public String getHTML() {
		return html;
	}

	/**
	 * Generate the Orion HTML editor by using the JET template
	 * HTMLEditor.htmljet
	 * 
	 * @param options
	 *            the editor options.
	 * @return the Orion HTML editor.
	 */
	private String generateHTML(EditorOptions options) {
		HTMLEditor template = new HTMLEditor();
		return template.generate(options);
	}
}
