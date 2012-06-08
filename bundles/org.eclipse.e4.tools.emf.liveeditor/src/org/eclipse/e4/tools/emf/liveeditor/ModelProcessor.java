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

import java.util.List;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.commands.MCommandsFactory;
import org.eclipse.e4.ui.model.application.commands.MHandler;
import org.eclipse.e4.ui.model.application.commands.MKeyBinding;
import org.eclipse.e4.ui.model.application.descriptor.basic.MPartDescriptor;

@SuppressWarnings("restriction")
public class ModelProcessor {
	
	@Execute
	public void process(MApplication application) {
		MCommand command = findElementInstance(application.getCommands(), "e4.tooling.livemodel"); 
				
		
		if( command == null ) {
			command = MCommandsFactory.INSTANCE.createCommand();
			command.setElementId("e4.tooling.livemodel");
			command.setCommandName("Show running app model");
			command.setDescription("Show the running application model");
			application.getCommands().add(command);						
		}
		
		MHandler handler = findElementInstance(application.getHandlers(), "e4.tooling.livemodel.handler");
		
		if( handler == null ) {
			handler = MCommandsFactory.INSTANCE.createHandler();
			handler.setElementId("e4.tooling.livemodel.handler");
			handler.setContributionURI("bundleclass://org.eclipse.e4.tools.emf.liveeditor/org.eclipse.e4.tools.emf.liveeditor.OpenLiveDialogHandler");
			handler.setCommand(command);
			application.getHandlers().add(handler);			
		} else {
			handler.setCommand(command);
		}

		
		MKeyBinding binding = null;
		
		if( application.getBindingTables().size() > 0 ) {
			binding = findElementInstance(application.getBindingTables().get(0).getBindings(), "e4.tooling.livemodel.binding");	
		}
		
		if( binding == null ) {
			binding = MCommandsFactory.INSTANCE.createKeyBinding();
			binding.setElementId("e4.tooling.livemodel.binding");
			binding.setKeySequence("ALT+SHIFT+F9");
			binding.setCommand(command);
			if( application.getBindingTables().size() > 0 ) {
				application.getBindingTables().get(0).getBindings().add(binding);	
			}			
		} else {
			binding.setCommand(command);
		}
		
		MPartDescriptor descriptor = findElementInstance(application.getDescriptors(), "org.eclipse.e4.tools.emf.liveeditor.view");

		if( descriptor == null ) {
			descriptor = org.eclipse.e4.ui.model.application.descriptor.basic.MBasicFactory.INSTANCE.createPartDescriptor();
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
		
	private <O> O findElementInstance(List<? extends MApplicationElement> l, String id) {
		for( MApplicationElement e : l ) {
			if( id.equals(e.getElementId()) ) {
				return (O) e;
			}
		}
		
		return null;
	}
}
