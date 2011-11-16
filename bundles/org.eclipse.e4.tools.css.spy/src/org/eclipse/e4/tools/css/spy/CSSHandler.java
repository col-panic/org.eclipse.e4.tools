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

public class CSSHandler {

    private String propertyName;
    private CSSStylableElement element;
    private ICSSPropertyHandler handler;
    private CSSEngine engine;

    public CSSHandler(String propertyName, CSSStylableElement element, ICSSPropertyHandler handler, CSSEngine engine) {
        this.propertyName = propertyName;
        this.element = element;
        this.handler = handler;
        this.engine = engine;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getValue() {
        try {
            return handler.retrieveCSSProperty(element, propertyName, "", engine);
        } catch (Exception e) {
            System.err.println("error retrieving '" + propertyName + "' from " + element + ": " + e);
            return null;
        }
    }

    public void setValue(CSSValue value) {
        try {
            handler.applyCSSProperty(element, propertyName, value, "", engine);
        } catch (Exception e) {
            System.err.println("error applying '" + propertyName + ": " + value + "' to " + element + ": " + e);
        }
    }

    @Override
    public String toString() {
        return propertyName;
    }

}
