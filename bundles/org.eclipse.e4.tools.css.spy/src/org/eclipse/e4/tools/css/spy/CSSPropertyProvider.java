/*******************************************************************************
 * Copyright (c) 2011 Manumitting Technologies, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Brian de Alwis (MT) - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.tools.css.spy;

import org.eclipse.e4.ui.css.core.dom.CSSStylableElement;
import org.eclipse.e4.ui.css.core.dom.properties.ICSSPropertyHandler;
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.w3c.dom.css.CSSValue;

/**
 * A getter and setter of a particular CSS property for a particular element.
 */
public class CSSPropertyProvider {

	private String propertyName;
	private CSSStylableElement element;
	private ICSSPropertyHandler handler;
	private CSSEngine engine;

	public CSSPropertyProvider(String propertyName, CSSStylableElement element,
			ICSSPropertyHandler handler, CSSEngine engine) {
		this.propertyName = propertyName;
		this.element = element;
		this.handler = handler;
		this.engine = engine;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public String getValue() throws Exception {
		return handler.retrieveCSSProperty(element, propertyName, "", engine);
	}

	public void setValue(String value) throws Exception {
		CSSValue v = engine.parsePropertyValue(value);
		handler.applyCSSProperty(element, propertyName, v, "", engine);
	}


	@Override
	public String toString() {
		return propertyName;
	}

}
