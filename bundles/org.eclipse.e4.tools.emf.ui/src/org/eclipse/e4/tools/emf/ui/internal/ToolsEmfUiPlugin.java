/*******************************************************************************
 * Copyright (c) 2012 MEDEVIT and FHV and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Marco Descher <marco@descher.at> - initial API and implementation
 ******************************************************************************/
package org.eclipse.e4.tools.emf.ui.internal;

import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ToolsEmfUiPlugin implements BundleActivator {
	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.e4.tools.emf.ui"; //$NON-NLS-1$

	private static ToolsEmfUiPlugin plugin;

	public static DialogSettings dialogSettings;

	public void start(BundleContext context) throws Exception {
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static ToolsEmfUiPlugin getDefault() {
		return plugin;
	}

	/**
	 * @see AbstractUiPlugin#getDialogSettings()
	 * @return the dialog settings
	 */
	public IDialogSettings getDialogSettings() {
		if (dialogSettings == null)
			loadDialogSettings();
		return dialogSettings;
	}

	private void loadDialogSettings() {
		// copy from AbstracUiPlugin
		dialogSettings = new DialogSettings(PLUGIN_ID);
	}

}
