/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 ******************************************************************************/
package org.eclipse.e4.tools.emf.liveeditor;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.tools.emf.ui.common.IModelResource;
import org.eclipse.e4.tools.emf.ui.internal.wbm.ApplicationModelEditor;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.MApplication;

public class LivePartDelegator {
	private ApplicationModelEditor instance;
	private IEclipseContext childContext;
	
	@Inject
	public LivePartDelegator(IEclipseContext context, MApplication application) {
		childContext = context.createChild("EditorContext");
		MemoryModelResource resource = new MemoryModelResource(application);
		childContext.set(IModelResource.class, resource);
		
		instance = ContextInjectionFactory.make(ApplicationModelEditor.class, childContext);
	}
	
	@Focus
	void focus() {
		ContextInjectionFactory.invoke(instance, Focus.class, childContext);
	}
}