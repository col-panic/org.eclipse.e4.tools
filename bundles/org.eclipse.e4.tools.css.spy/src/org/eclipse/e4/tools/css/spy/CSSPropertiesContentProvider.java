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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.e4.ui.css.core.dom.CSSStylableElement;
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Widget;

public class CSSPropertiesContentProvider implements IStructuredContentProvider {

    protected CSSEngine cssEngine;
    protected CSSStylableElement input;

    public void dispose() {
        cssEngine = null;
        input = null;
    }

    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        if (newInput instanceof CSSStylableElement) {
            this.input = (CSSStylableElement) newInput;
            this.cssEngine = CssSpyDialog.getCSSEngine((Widget) input.getNativeWidget());
        } else if (newInput instanceof Widget) {
            this.cssEngine = CssSpyDialog.getCSSEngine((Widget) newInput);
			this.input = (CSSStylableElement) cssEngine.getElement(newInput);
        }
    }

    public Object[] getElements(Object inputElement) {
		Collection<String> propertyNames = cssEngine.getCSSProperties(input);
		List<CSSPropertyProvider> properties = new ArrayList<CSSPropertyProvider>(
				propertyNames.size());
		for (String propertyName : propertyNames) {
            properties.add(new CSSPropertyProvider(propertyName, input, cssEngine));
        }
        return properties.toArray();
    }

}
