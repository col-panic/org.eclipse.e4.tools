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
package org.eclipse.e4.tools.orion.editor.builder.css;

import java.io.File;
import java.io.IOException;

import org.eclipse.e4.tools.orion.editor.builder.EditorOptions;

/**
 * CSS Editor options.
 * 
 */
public class CSSOptions extends EditorOptions {

	private static final String CSS_LANG = "css";

	/**
	 * Constructor of the editor options with URL of CSS and JS.
	 * 
	 * @param editorJsUrl
	 *            the full URL of "built-editor.js".
	 * @param editorCssUrl
	 *            the full URL of "built-editor.css".
	 * @param keywords
	 *            to customize CSS completion.
	 */
	public CSSOptions(String editorJsUrl, String editorCssUrl, String keywords) {
		super(editorJsUrl, editorCssUrl, CSS_LANG);
		createEditor(keywords);
	}

	/**
	 * Constructor of the editor options with the base URL of CSS and JS.
	 * 
	 * @param baseURL
	 *            base URL of the CSS and JS.
	 * @param keywords
	 *            to customize CSS completion.
	 */
	public CSSOptions(String baseURL, String keywords) {
		super(baseURL, CSS_LANG);
		createEditor(keywords);
	}

	/**
	 * Constructor of the editor options with the file base dir of CSS and JS.
	 * 
	 * @param baseDir
	 *            file base directory of the CSS and JS.
	 * @param keywords
	 *            to customize CSS completion.
	 */
	public CSSOptions(File baseDir, String keywords) {
		super(baseDir, CSS_LANG);
		createEditor(keywords);
	}

	/**
	 * Constructor of the editor options to use only on OSGi context.
	 * 
	 * @param keywords
	 *            to customize CSS completion.
	 * @throws IOException
	 */
	public CSSOptions(String keywords) throws IOException {
		super(CSS_LANG);
		createEditor(keywords);
	}

	/**
	 * Create the Orion editor with edit function.
	 * 
	 * @param keywords
	 *            to customize CSS completion.
	 */
	private void createEditor(String keywords) {
		String cssEdit = new CSSEdit().generate(keywords);
		super.addScript(cssEdit);
	}

}
