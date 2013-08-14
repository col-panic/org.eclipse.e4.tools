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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CapturedEvent {
	private String topic;

	private String publisherClassName = "";

	private String changedElementClassName = "";

	private List<Parameter> parameters;

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setPublisherClassName(String publisherClassName) {
		this.publisherClassName = publisherClassName;
	}

	public String getPublisherClassName() {
		return publisherClassName;
	}

	public void setChangedElementClassName(String changedElementClassName) {
		this.changedElementClassName = changedElementClassName;
	}

	public String getChangedElementClassName() {
		return changedElementClassName;
	}

	public void addParameter(String name, Object value) {
		if (parameters == null) {
			parameters = new ArrayList<Parameter>();
		}
		parameters.add(new Parameter(name, value));
	}

	@SuppressWarnings("unchecked")
	public List<Parameter> getParameters() {
		return parameters != null? parameters: Collections.EMPTY_LIST;
	}

	public boolean hasParameters() {
		return parameters != null;
	}

	@Override
	public String toString() {
		return topic;
	}
}
