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
package org.eclipse.e4.tools.event.spy.util;

import org.eclipse.e4.tools.event.spy.model.Parameter;

public class ParameterFormatter {
	//TODO: Add some parameter formatting and break to long strings into multiple lines
	public static String toString(Parameter parameter) {
		return String.format("%s = %s", parameter.getName(), parameter.getValue());
	}
}
