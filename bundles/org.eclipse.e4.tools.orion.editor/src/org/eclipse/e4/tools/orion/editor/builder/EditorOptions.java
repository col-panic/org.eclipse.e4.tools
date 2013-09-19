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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.e4.tools.orion.editor.internal.Activator;

/**
 * Editor options used in the JET template HTMLEditor.htmljet to generate Orion
 * HTML editor.
 * 
 */
public class EditorOptions {

	public static final String BUILT_EDITOR_JS = "/web/built-editor.js";
	public static final String BUILT_EDITOR_CSS = "/web/built-editor.css";
	private static final String FILE_START_URL = "file://";

	private final String editorCssUrl;
	private final String editorJsUrl;
	private final String lang;
	private final Collection<String> scripts;

	/**
	 * Constructor of the editor options with URL of CSS and JS.
	 * 
	 * @param editorJsUrl
	 *            the full URL of "built-editor.js".
	 * @param editorCssUrl
	 *            the full URL of "built-editor.css".
	 * @param lang
	 *            the mode of the editor (css, js, html, java).
	 */
	public EditorOptions(String editorJsUrl, String editorCssUrl, String lang) {
		this.editorCssUrl = editorCssUrl;
		this.editorJsUrl = editorJsUrl;
		this.scripts = new ArrayList<String>();
		this.lang = lang;
	}

	/**
	 * Constructor of the editor options with the base URL of CSS and JS.
	 * 
	 * @param baseURL
	 *            base URL of the CSS and JS.
	 * @param lang
	 *            the mode of the editor (css, js, html, java).
	 */
	public EditorOptions(String baseURL, String lang) {
		this(baseURL + BUILT_EDITOR_JS, baseURL + BUILT_EDITOR_CSS, lang);
	}

	/**
	 * Constructor of the editor options with the file base dir of CSS and JS.
	 * 
	 * @param baseDir
	 *            file base directory of the CSS and JS.
	 * @param lang
	 *            the mode of the editor (css, js, html, java).
	 */
	public EditorOptions(File baseDir, String lang) {
		this(toURL(baseDir), lang);
	}

	/**
	 * Constructor of the editor options to use only on OSGi context.
	 * 
	 * @param lang
	 *            the mode of the editor (css, js, html, java).
	 */
	public EditorOptions(String lang) throws IOException {
		this(getURL(BUILT_EDITOR_JS), getURL(BUILT_EDITOR_CSS), lang);
	}

	/**
	 * Returns the full URL of the given path.
	 * 
	 * @param path
	 *            path to resolve.
	 * @return the full URL of the given path.
	 * @throws IOException
	 */
	private static String getURL(String path) throws IOException {
		if (Activator.getContext() == null) {
			throw new IOException("Cannot resolve the path=" + path
					+ ". This constructor must be used only on OSGi context");
		}
		return FileLocator.toFileURL(
				Activator.getContext().getBundle().getEntry(path))
				.toExternalForm();
	}

	/**
	 * Returns the file URL formatted with file://
	 * 
	 * @param file
	 *            the file
	 * @return the file URL formatted with file://
	 */
	private static String toURL(File file) {
		try {
			return new StringBuilder(FILE_START_URL).append(
					file.getCanonicalPath()).toString();
		} catch (IOException e) {
			return new StringBuilder(FILE_START_URL).append(file.getPath())
					.toString();
		}
	}

	/**
	 * Returns the full URL of the Orion Javascript /web/built-editor.js
	 * 
	 * @return the full URL of the Orion Javascript /web/built-editor.js
	 */
	public String getEditorCssUrl() {
		return editorCssUrl;
	}

	/**
	 * Returns the full URL of the Orion CSS /web/built-editor.css
	 * 
	 * @return the full URL of the Orion CSS /web/built-editor.css
	 */
	public String getEditorJsUrl() {
		return editorJsUrl;
	}

	/**
	 * Add content script.
	 * 
	 * @param script
	 *            the content script to add.
	 */
	public void addScript(String script) {
		this.scripts.add(script);
	}

	/**
	 * Returns list of script content to add.
	 * 
	 * @return
	 */
	public Collection<String> getScripts() {
		return scripts;
	}

	/**
	 * Returns the mode of the editor (css, js, html, java).
	 * 
	 * @return the mode of the editor (css, js, html, java).
	 */
	public String getLang() {
		return lang;
	}
}
