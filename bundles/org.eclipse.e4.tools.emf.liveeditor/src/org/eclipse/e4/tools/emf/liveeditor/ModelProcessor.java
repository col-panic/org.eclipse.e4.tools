/*******************************************************************************
 * Copyright (c) 2010 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 ******************************************************************************/
package org.eclipse.e4.tools.emf.liveeditor;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.commands.MCommandsFactory;
import org.eclipse.e4.ui.model.application.commands.MHandler;
import org.eclipse.e4.ui.model.application.commands.MKeyBinding;
import org.eclipse.e4.ui.model.application.descriptor.basic.MPartDescriptor;

public class ModelProcessor {
	
	@Execute
	public void process(MApplication application) {
		MCommand command = MCommandsFactory.INSTANCE.createCommand();
		command.setElementId("e4.tooling.livemodel");
		command.setCommandName("Show running app model");
		command.setDescription("Show the running application model");
		application.getCommands().add(command);
		
		MHandler handler = MCommandsFactory.INSTANCE.createHandler();
		handler.setContributionURI("bundleclass://org.eclipse.e4.tools.emf.liveeditor/org.eclipse.e4.tools.emf.liveeditor.OpenLiveDialogHandler");
		handler.setCommand(command);
		application.getHandlers().add(handler);
		
		MKeyBinding binding = MCommandsFactory.INSTANCE.createKeyBinding();
		binding.setKeySequence("ALT+SHIFT+F9");
		binding.setCommand(command);
		if( application.getBindingTables().size() > 0 ) {
			application.getBindingTables().get(0).getBindings().add(binding);	
		}
		
		MPartDescriptor descriptor = org.eclipse.e4.ui.model.application.descriptor.basic.MBasicFactory.INSTANCE.createPartDescriptor();
		descriptor.setCategory("org.eclipse.e4.secondaryDataStack");
		descriptor.setElementId("org.eclipse.e4.tools.emf.liveeditor.view");
		descriptor.getTags().add("View");
		descriptor.getTags().add("categoryTag:General");
		
		descriptor.setLabel("Live Application Model");
		descriptor.setContributionURI("bundleclass://org.eclipse.e4.tools.emf.liveeditor/org.eclipse.e4.tools.emf.liveeditor.LivePartDelegator");
		descriptor.setContributorURI("bundleclass://org.eclipse.e4.tools.emf.liveeditor");
		descriptor.setIconURI("platform:/plugin/org.eclipse.e4.tools.emf.liveeditor/icons/full/obj16/application_lightning.png");
		application.getDescriptors().add(descriptor);
	}
}
