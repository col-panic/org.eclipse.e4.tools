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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.RegistryFactory;

/**
 * Build the Orion HTML editor for CSS mode with E4 CSS selectors.
 * 
 */
public class E4CSSBuilder extends CSSBuilder {

	private static E4CSSBuilder instance;

	/**
	 * Returns an instance of E4CSSBuilder. Since instances of this class do not
	 * maintain any state, they can be shared between multiple clients.
	 * 
	 * @return an instance of E4CSSBuilder
	 * @throws IOException
	 */
	public static E4CSSBuilder getInstance() throws IOException {
		synchronized (E4CSSBuilder.class) {
			if (instance == null) {
				instance = new E4CSSBuilder();
			}
			return instance;
		}
	}

	public E4CSSBuilder() throws IOException {
		super(loadKeywords());
	}

	/**
	 * Returns keywords for CSS completion with E4 CSS Engine properties to
	 * customize completion;
	 * 
	 * @return keywords for CSS completion with E4 CSS Engine properties.
	 */
	private static String loadKeywords() {
		StringBuilder buf = new StringBuilder();

		IExtensionRegistry registry = RegistryFactory.getRegistry();
		IExtensionPoint extPoint = registry
				.getExtensionPoint("org.eclipse.e4.ui.css.core.propertyHandler");
		ArrayList<IConfigurationElement> matchingElements = new ArrayList<IConfigurationElement>();
		ArrayList<IConfigurationElement> controlAdapters = new ArrayList<IConfigurationElement>();
		for (IExtension e : extPoint.getExtensions()) {
			IConfigurationElement[] elements = e.getConfigurationElements();
			for (int i = 0; i < elements.length; i++) {
				IConfigurationElement element = elements[i];
				controlAdapters.add(element);
				IConfigurationElement[] child = element
						.getChildren("property-name");
				for (int j = 0; j < child.length; j++) {
					matchingElements.add(child[j]);
				}
			}
		}
		Iterator<IConfigurationElement> iter = matchingElements.iterator();
		boolean once = true;
		while (iter.hasNext()) {
			IConfigurationElement type = iter.next();
			String name = type.getAttribute("name");
			if (!once) {
				buf.append(',');
				buf.append('\n');
			}
			buf.append('"');
			buf.append(name);
			buf.append('"');
			once = false;
		}
		buf.append('\n');

		return buf.toString();
	}
}
