/*******************************************************************************
 * Copyright (c) 2011 Manumitting Technologies, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Brian de Alwis (MT) - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.tools.css.spy;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.commands.MBindingContext;
import org.eclipse.e4.ui.model.application.commands.MBindingTable;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.commands.MCommandsFactory;
import org.eclipse.e4.ui.model.application.commands.MHandler;
import org.eclipse.e4.ui.model.application.commands.MKeyBinding;

public class SpyInstaller {
	public static final String OPEN_SPY_COMMAND_ID = "org.eclipse.e4.css.OpenSpy";
	private static final String SPY_HANDLER_ID = OpenSpyHandler.class.getName();
    private static final String SPY_HANDLER_URI = "platform:/plugin/org.eclipse.e4.tools.css.spy/"
			+ OpenSpyHandler.class.getName();

	@Inject
	protected MApplication app;

	@Execute
	public void execute() {
		MCommand cmd = installSpyCommand();
		installSpyHandler(cmd);
        installSpyBinding("org.eclipse.ui.contexts.dialogAndWindow", cmd, "M2+M3+F4");
	}

	private MCommand installSpyCommand() {
		for(MCommand cmd : app.getCommands()) {
			if(OPEN_SPY_COMMAND_ID.equals(cmd.getElementId())) {
				System.err.println("CSS Spy command already setup");
				return cmd;
			}
		}

		MCommand cmd = MCommandsFactory.INSTANCE.createCommand();
		cmd.setCommandName("Open CSS Spy");
		cmd.setElementId(OPEN_SPY_COMMAND_ID);
		app.getCommands().add(cmd);
		return cmd;
	}

	private MHandler installSpyHandler(MCommand cmd) {
		for(MHandler hdlr : app.getHandlers()) {
			if(SPY_HANDLER_ID.equals(hdlr.getElementId())) {
				System.err.println("CSS Spy handler already setup");
				return hdlr;
			}
		}

		MHandler hdlr = MCommandsFactory.INSTANCE.createHandler();
		hdlr.setElementId(SPY_HANDLER_ID);
		hdlr.setContributionURI(SPY_HANDLER_URI);
		hdlr.setCommand(cmd);
		app.getHandlers().add(hdlr);
		return hdlr;
	}

	private void installSpyBinding(String bindingContextId, MCommand cmd, String keySeq) {
		for(MBindingTable table : app.getBindingTables()) {
			for(MKeyBinding binding : table.getBindings()) {
				if(binding.getCommand() == cmd) {
					System.err.println("Spy binding already installed");
					return;
				}
			}
		}

		MBindingContext context = null;
		for(MBindingContext ctxt : app.getBindingContexts()) {
			if(ctxt.getElementId().equals(bindingContextId)) {
				context = ctxt;
				break;
			}
		}
		if(context == null) {
			System.err.println("Cannot find binding context: " + bindingContextId);
			return;
		}

		MBindingTable bindingTable = null;
		String tableId = "bt." + cmd.getElementId();
		for(MBindingTable table : app.getBindingTables()) {
			if(tableId.equals(table.getElementId())) {
				bindingTable = table;
			}
		}

		if(bindingTable == null) {
			bindingTable = MCommandsFactory.INSTANCE.createBindingTable();
			bindingTable.setElementId(tableId);
			bindingTable.setBindingContext(context);
			app.getBindingTables().add(bindingTable);
		}

		MKeyBinding binding = MCommandsFactory.INSTANCE.createKeyBinding();
		binding.setCommand(cmd);
		binding.setKeySequence(keySeq);
		binding.setElementId("kb." + cmd.getElementId());
		bindingTable.getBindings().add(binding);
	}

}
