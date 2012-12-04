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

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.osgi.service.datalocation.Location;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.util.tracker.ServiceTracker;

public class ToolsEmfUiPlugin implements BundleActivator {
	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.e4.tools.emf.ui"; //$NON-NLS-1$

	private static ToolsEmfUiPlugin plugin;
	private BundleContext context;

	private ServiceTracker locationTracker;

	public void start(BundleContext context) throws Exception {
		plugin = this;
		this.context = context;
	}

	public void stop(BundleContext context) throws Exception {
		saveDialogSettings();
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
	 * @return the instance Location service
	 */
	private Location getInstanceLocation() {
		if (locationTracker == null) {
			Filter filter = null;
			try {
				filter = context.createFilter(Location.INSTANCE_FILTER);
			} catch (InvalidSyntaxException e) {
				// ignore this. It should never happen as we have tested the
				// above format.
			}
			locationTracker = new ServiceTracker(context, filter, null);
			locationTracker.open();
		}
		return (Location) locationTracker.getService();
	}

	private void loadDialogSettings() {
		dialogSettings = new DialogSettings(PLUGIN_ID);

		File dialogSettingsFile = getDialogSettingsFile();

		if (dialogSettingsFile.exists()) {
			try {
				dialogSettings.load(dialogSettingsFile.getAbsolutePath());
			} catch (IOException e) {
				// load failed spec'ed to ignore problems
			}
			return;
		}

	}

	private void saveDialogSettings() {
		if (dialogSettings == null) {
			return;
		}

		File dialogSettingsFile = getDialogSettingsFile();

		try {
			dialogSettings.save(dialogSettingsFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
			// spec'ed to ignore problems
		}
	}

	private File getDialogSettingsFile() {
		File baseLocation;
		try {
			baseLocation = new File(URIUtil.toURI(getInstanceLocation().getURL()));
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
		baseLocation = new File(baseLocation, ".metadata"); //$NON-NLS-1$
		baseLocation = new File(baseLocation, ".plugins"); //$NON-NLS-1$
		baseLocation = new File(baseLocation, PLUGIN_ID);
		File dialogSettingsFile = new File(baseLocation, FN_DIALOG_SETTINGS);
		if (!dialogSettingsFile.exists())
			dialogSettingsFile.getParentFile().mkdirs();
		return dialogSettingsFile;
	}

	// //////////////////////////////////////////////////////////////////////
	// The following code was copied from AbstractUIPlugin class.
	/**
	 * The name of the dialog settings file (value
	 * <code>"dialog_settings.xml"</code>).
	 */
	private static final String FN_DIALOG_SETTINGS = "dialog_settings.xml"; //$NON-NLS-1$
	/**
	 * Storage for dialog and wizard data; <code>null</code> if not yet
	 * initialized.
	 */
	private IDialogSettings dialogSettings = null;

	/**
	 * @see AbstractUiPlugin#getDialogSettings()
	 * @return the dialog settings
	 */
	public IDialogSettings getDialogSettings() {
		if (dialogSettings == null) {
			loadDialogSettings();
		}

		return dialogSettings;
	}

}
