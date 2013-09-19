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
package org.eclipse.e4.tools.orion.editor.builder.js;

import java.io.File;
import java.io.IOException;

import org.eclipse.e4.tools.orion.editor.builder.EditorOptions;

/**
 * JS Editor options.
 * 
 */
public class JSOptions extends EditorOptions {

	private static final String JS_LANG = "js";

	/**
	 * Constructor of the editor options with URL of CSS and JS.
	 * 
	 * @param editorJsUrl
	 *            the full URL of "built-editor.js".
	 * @param editorCssUrl
	 *            the full URL of "built-editor.css".
	 */
	public JSOptions(String editorJsUrl, String editorCssUrl) {
		super(editorJsUrl, editorCssUrl, JS_LANG);
		createEditor();
	}

	/**
	 * Constructor of the editor options with the base URL of CSS and JS.
	 * 
	 * @param baseURL
	 *            base URL of the CSS and JS.
	 */
	public JSOptions(String baseURL) {
		super(baseURL, JS_LANG);
		createEditor();
	}

	/**
	 * Constructor of the editor options with the file base dir of CSS and JS.
	 * 
	 * @param keywords
	 *            to customize CSS completion.
	 */
	public JSOptions(File baseDir) {
		super(baseDir, JS_LANG);
		createEditor();
	}

	/**
	 * Constructor of the editor options to use only on OSGi context.
	 * 
	 * @throws IOException
	 */
	public JSOptions() throws IOException {
		super(JS_LANG);
		createEditor();
	}

	/**
	 * Create the Orion editor with edit function.
	 * 
	 * @param keywords
	 *            to customize CSS completion.
	 */
	private void createEditor() {
		String jsEdit = new JSEdit().generate(null);
		super.addScript(jsEdit);
	}

}
