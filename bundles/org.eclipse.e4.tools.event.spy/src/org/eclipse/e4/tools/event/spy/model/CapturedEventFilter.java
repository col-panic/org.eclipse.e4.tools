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

public class CapturedEventFilter {
	private final static String FILTER_AS_STRING_PATTERN = "Capture event when '%s' %s '%s'";

	private final ItemToFilter itemToFilter;

	private final Operator operator;

	private final String value;

	public CapturedEventFilter(ItemToFilter itemToFilter, Operator operator, String value) {
		this.itemToFilter = itemToFilter;
		this.operator = operator;
		this.value = normalize(itemToFilter, value);
	}

	public ItemToFilter getItemToFilter() {
		return itemToFilter;
	}

	public Operator getOperator() {
		return operator;
	}

	public String getValue() {
		return value;
	}

	private String normalize(ItemToFilter itemToFilter, String value) {
		if (ItemToFilter.ParameterNameAndValue.equals(itemToFilter)) {
			String[] splitted = value.split("=");
			if (splitted.length != 2) {
				throw new IllegalArgumentException("Invalid value format, it should be: " +
						String.format(SpecialValue.NameAndValue.toString(), "Name", "Value"));
			}
			return String.format(SpecialValue.NameAndValue.toString(), splitted[0].trim(), splitted[1].trim());
		}
		return value;
	}

	@Override
	public String toString() {
		return String.format(FILTER_AS_STRING_PATTERN, itemToFilter, operator, value);
	}
}
