/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.tools.event.spy.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Listener;

public class ToggleLink {
	private Link link;

	private ClickListener listener;

	private String[] text = {"", ""};

	public interface ClickListener {
		void clicked(boolean toggled);
	}

	public ToggleLink(Composite parent) {
		link = new Link(parent, SWT.NONE);
		link.setSize(SWT.DEFAULT, SWT.DEFAULT);
		link.addListener (SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				updateText();
				if (listener != null) {
					listener.clicked(isToggled());
				}
			}
		});
	}

	private void updateText() {
		String textToUpdate = link.getText().contains(text[0])? text[1]: text[0];
		setText(textToUpdate);
	}

	private void setText(String text) {
		link.setText(String.format("<a>%s</a>", text));
	}

	public void setClickListener(ClickListener listener) {
		this.listener = listener;
	}

	public void setText(String[] text /*normal text, toggle text*/) {
		this.text = text;
		setText(isToggled()? text[1]: text[0]);
	}

	public Control getControl() {
		return link;
	}

	private boolean isToggled() {
		return link.getText().contains(text[1]);
	}
}
