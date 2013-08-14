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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.SearchablePluginsManager;
import org.eclipse.pde.internal.runtime.PDERuntimeMessages;
import org.eclipse.pde.internal.runtime.PDERuntimePlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;

public class PDEUtils {
	private final static Pattern CLASS_NAME_PATTERN = Pattern.compile("(([a-zA-Z_]+[0-9]*\\.)+[a-zA-Z_]+[a-z0-9]*)");

	public static void openClass(String clsName) throws ClassNotFoundException {
		Matcher matcher = CLASS_NAME_PATTERN.matcher(clsName);
		if (matcher.find()) {
			try {
				clsName = matcher.group(1).trim();
				openClass(Class.forName(clsName));
			} catch(ClassNotFoundException exc) {
				throw new ClassNotFoundException("Class not found in the bundle classpath: " + clsName);
			}
		}
	}

	public static void openClass(Class<?> cls) {
		IPluginModelBase model = PluginRegistry.findModel(PluginUtils.getBundleId(cls));
		IResource resource = model != null ? model.getUnderlyingResource() : null;
		IJavaProject project = null;

		// if we don't find a model
		if (model == null) {
			MessageDialog.openError(Display.getCurrent().getActiveShell(), PDERuntimeMessages.SpyIDEUtil_noSourceFound_title,
					NLS.bind(PDERuntimeMessages.SpyIDEUtil_noSourceFound_message, new Object[] {cls.getName()}));
			return;
		}

		if (resource != null) { // project is open in workspace
			project = JavaCore.create(resource.getProject());
		} else {
			SearchablePluginsManager manager = PDECore.getDefault().getSearchablePluginsManager();
			try {
				manager.createProxyProject(new NullProgressMonitor());
				manager.addToJavaSearch(new IPluginModelBase[] {model});
				project = manager.getProxyProject();
			} catch (CoreException e) {
			}
		}
		if (project != null)
			openInEditor(project, cls.getName());
	}

	private static void openInEditor(IJavaProject project, String clazz) {
		try {
			IType type = project.findType(clazz);
			JavaUI.openInEditor(type, false, true);
		} catch (JavaModelException e) {
			PDERuntimePlugin.log(e);
		} catch (PartInitException e) {
			PDERuntimePlugin.log(e);
		}
	}
}
