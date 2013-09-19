/*******************************************************************************
 * Copyright (c) 2013 Angelo Zerr and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.tools.orion.swt.samples;

import java.io.File;

import org.eclipse.e4.tools.orion.editor.builder.js.JSBuilder;
import org.eclipse.e4.tools.orion.editor.swt.IDirtyListener;
import org.eclipse.e4.tools.orion.editor.swt.OrionEditorControl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

/**
 * Java main which uses {@link OrionEditorControl} to load JS content with Orion
 * editor.
 */
public class JSEditor {

	public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setSize(500, 500);
		shell.setText("Orion JS Editor");
		shell.setLayout(new GridLayout());

		JSBuilder builder = new JSBuilder(new File(
				"../org.eclipse.e4.tools.orion.editor"));
		OrionEditorControl editor = new OrionEditorControl(shell, SWT.BORDER, builder);
		editor.setLayoutData(new GridData(GridData.FILL_BOTH));

		// Menu
		Menu menuBar = createMenu(shell, editor);
		shell.setMenuBar(menuBar);

		editor.setText("var arr = [];");

		shell.open();
		editor.setFocus();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();

	}

	private static Menu createMenu(final Shell shell, final OrionEditorControl editor) {
		Menu menuBar = new Menu(shell, SWT.BAR);
		// File menu
		createFileMenu(shell, menuBar, editor);
		return menuBar;
	}

	private static void createFileMenu(final Shell shell, Menu menuBar,
			final OrionEditorControl editor) {
		MenuItem fileMenuHeader = new MenuItem(menuBar, SWT.CASCADE);
		fileMenuHeader.setText("&File");

		Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
		fileMenuHeader.setMenu(fileMenu);

		// Save
		final MenuItem fileSaveItem = new MenuItem(fileMenu, SWT.PUSH);
		fileSaveItem.setText("&Save");
		fileSaveItem.setEnabled(false);
		fileSaveItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				editor.setDirty(false);
			}
		});

		editor.addDirtyListener(new IDirtyListener() {
			public void dirtyChanged(boolean dirty) {
				fileSaveItem.setEnabled(dirty);
			}
		});

		// Exit
		MenuItem fileExitItem = new MenuItem(fileMenu, SWT.PUSH);
		fileExitItem.setText("E&xit");
		fileExitItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				shell.close();
				// shell.getDisplay().dispose();
			}
		});
	}
}
