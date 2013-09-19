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
package org.eclipse.e4.tools.orion.swt.samples;

import java.io.File;
import java.io.IOException;

import org.eclipse.e4.tools.orion.editor.builder.HTMLEditor;
import org.eclipse.e4.tools.orion.editor.builder.EditorOptions;
import org.eclipse.e4.tools.orion.editor.builder.css.CSSEdit;

/**
 * Main which shows how to use {@link HTMLEditor} builder to generate HTML Orion
 * editor.
 * 
 */
public class HTMLEditorTest {

	public static void main(String[] args) throws IOException {
		HTMLEditor builder = new HTMLEditor();

		File f = new File("");

		EditorOptions context = new EditorOptions(f, "css");

		String keywords = "";
		String cssEdit = new CSSEdit().generate(keywords);
		context.addScript(cssEdit);

		context.getScripts();

		String s = builder.generate(context);
		System.err.println(s);

	}
}
