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
package org.eclipse.e4.tools.event.spy.model;

public class CapturedEventTreeSelection {
	private String selection;

	private boolean parameter;

	public CapturedEventTreeSelection(String selection, boolean parameter) {
		this.selection = selection;
		this.parameter = parameter;
	}

	public String getSelection() {
		return selection;
	}

	public boolean isParameter() {
		return parameter;
	}
}
