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
package org.eclipse.e4.tools.event.spy;

import org.eclipse.e4.tools.event.spy.util.PluginUtils;
import org.eclipse.e4.ui.bindings.EBindingService;

public class Constants {
	public static final String PLUGIN_ID = PluginUtils.getBundleId(Constants.class);

	public static final String BINDING_MODIFIED_BY_USER_TAG = EBindingService.TYPE_ATTR_TAG + ":user";

	public static final String BINDING_DELETED_BY_USER_TAG = EBindingService.DELETED_BINDING_TAG;
}
