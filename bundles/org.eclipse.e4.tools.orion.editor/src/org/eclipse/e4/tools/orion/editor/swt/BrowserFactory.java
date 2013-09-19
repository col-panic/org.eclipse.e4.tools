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
package org.eclipse.e4.tools.orion.editor.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;

/**
 * SWT {@link Browser} factory.
 * 
 * With this factory it's possible to set the default browser style to create
 * (for instance with a Preferences Page).
 * 
 */
public class BrowserFactory {

	private static int defaultBrowserStyle = SWT.NONE;

	/**
	 * Set the default browser style.
	 * 
	 * @param defaultBrowserStyle
	 */
	public static void setDefaultBrowserStyle(int defaultBrowserStyle) {
		BrowserFactory.defaultBrowserStyle = defaultBrowserStyle;
	}

	/**
	 * Returns the default browser style.
	 * 
	 * @return
	 */
	public static int getDefaultBrowserStyle() {
		return defaultBrowserStyle;
	}

	/**
	 * Create an instance of SWT {@link Browser}.
	 * 
	 * @param parent
	 *            a widget which will be the parent of the new instance (cannot
	 *            be null)
	 * @param style
	 *            the style of widget to construct. If null use the default.
	 *            style
	 * @return an instance of SWT {@link Browser}.
	 */
	public static Browser create(Composite parent, Integer style) {
		if (style == null) {
			// none style, use the default style.
			style = getDefaultBrowserStyle();
		}
		return new Browser(parent, style);
	}
}
