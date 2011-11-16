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
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;

public class WidgetCSSDetailsLabelProvider extends ColumnLabelProvider {
    @Override
    public void update(ViewerCell cell) {
        super.update(cell);
        CSSStylableElement element = CssSpyDialog.getCSSElement(cell.getElement());
        if (element == null) {
            return;
        }
        switch(cell.getColumnIndex()) {
        case 0:
            cell.setText(element.getLocalName() + " (" + element.getNamespaceURI() + ")");
            break;
        case 1:
            if (element.getCSSClass() == null) {
                cell.setText("");
            } else {
                String classes[] = element.getCSSClass().split(" +");
                cell.setText(classes.length <= 1 ? classes[0] : classes[0] + " (+" + (classes.length - 1) + " others)");
            }
            return;
        case 2:
            cell.setText(element.getCSSId());
            return;
        }
    }

    @Override
    public String getToolTipText(Object item) {
        CSSStylableElement element = CssSpyDialog.getCSSElement(item);
        if (element == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(element.getLocalName()).append(" (").append(element.getNamespaceURI()).append(")");
        sb.append("\nClasses:\n ");
        Activator.join(sb, element.getCSSClass().split(" +"), "\n ");
        return sb.toString();
    }


}
