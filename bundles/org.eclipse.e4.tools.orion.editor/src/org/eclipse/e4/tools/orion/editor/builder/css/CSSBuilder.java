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

import org.eclipse.e4.tools.orion.editor.builder.AbstractHTMLBuilder;
import org.eclipse.e4.tools.orion.editor.builder.IHTMLBuilder;

/**
 * {@link IHTMLBuilder} to build the Orion HTML editor for CSS mode.
 * 
 */
public class CSSBuilder extends AbstractHTMLBuilder {

	/**
	 * Constructor with {@link CSSOptions}.
	 * 
	 * @param options
	 *            the CSS options.
	 */
	public CSSBuilder(CSSOptions options) {
		super(options);
	}

	/**
	 * Constructor with file base dir.
	 * 
	 * @param baseDir
	 *            base directory of the CSS and JS.
	 * @param keywords
	 *            to customize CSS completion.
	 */
	public CSSBuilder(File baseDir, String keywords) {
		this(new CSSOptions(baseDir, keywords));
	}

	/**
	 * Constructor to use only on OSGi context.
	 * 
	 * @param keywords
	 *            to customize CSS completion.
	 */
	public CSSBuilder(String keywords) throws IOException {
		this(new CSSOptions(keywords));
	}
}
