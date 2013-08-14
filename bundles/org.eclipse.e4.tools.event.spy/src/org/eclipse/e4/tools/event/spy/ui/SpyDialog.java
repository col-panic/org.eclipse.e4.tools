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
package org.eclipse.e4.tools.event.spy.ui;

import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.tools.event.spy.core.EventMonitor;
import org.eclipse.e4.tools.event.spy.model.CapturedEvent;
import org.eclipse.e4.tools.event.spy.model.CapturedEventTreeSelection;
import org.eclipse.e4.tools.event.spy.util.LoggerWrapper;
import org.eclipse.e4.tools.event.spy.util.PDEUtils;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class SpyDialog extends Dialog implements EventMonitor.NewEventListener {
	private final static String DIALOG_TITLE = "Event spy dialog";

	private final static String[] SHOW_FILTER_LINK_TEXT = new String[]{"Show filters", "Hide filters"};

	private CapturedEventTree capturedEventTree;

	private CapturedEventFilters capturedEventFilters;

	private Composite outer;

	private EventMonitor eventMonitor;

	private ToggleLink showFiltersLink;

	@Inject
	private LoggerWrapper logger;

	@Inject
	private IEventBroker eventBroker;

	@Inject
	public SpyDialog(Shell shell) {
		super(shell);
		setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE);
	}

	/* Layout scheme:
	 *
	 *  +-- Outer ----------------------------------------+
	 *  | +-- actionBar --------------------------------+ |
	 *  | |                                             | |
	 *  | |  Start capturing events | ShowFiltersLink   | |
	 *  | |                                             | |
	 *  | +---------------------------------------------+ |
	 *  +-------------------------------------------------+
	 *  |                                                 |
	 *  |  CapturedEventFilters                           |
	 *  |                                                 |
	 *  +-------------------------------------------------+
	 *  |                                                 |
	 *  |  CapturedEventTree                              |
	 *  |                                                 |
	 *  +-------------------------------------------------+
	 *  |                                                 |
	 *  |                                          Close  |
	 *  |                                                 |
	 *  +-------------------------------------------------+
	 *
	 * */

	@Override
	protected Point getInitialSize() {
		return new Point(600, 400);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		outer = (Composite) super.createDialogArea(parent);

		createActionBar(outer);
		createFilters(outer);
		createCapturedEventTree(outer);

		return outer;
	}

	private void createActionBar(Composite parent) {
		Composite actionBar = new Composite(parent, SWT.NONE);
		GridData gridData = createDefaultGridData();
		gridData.grabExcessVerticalSpace = false;
		actionBar.setLayoutData(gridData);

		RowLayout rowLayout = new RowLayout(SWT.HORIZONTAL);
		rowLayout.spacing = 20;
		actionBar.setLayout(rowLayout);

		ToggleLink link = new ToggleLink(actionBar);
		link.setText(new String[]{"Start capturing events", "Stop capturing events"});
		link.setClickListener(new ToggleLink.ClickListener() {
			public void clicked(boolean toggled) {
				if (toggled) {
					captureEvents();
				} else {
					stopCaptureEvents();
				}
			}
		});

		showFiltersLink = new ToggleLink(actionBar);
		showFiltersLink.setText(new String[]{SHOW_FILTER_LINK_TEXT[0], SHOW_FILTER_LINK_TEXT[1]});
		showFiltersLink.getControl().setLayoutData(new RowData(130, SWT.DEFAULT));
		showFiltersLink.setClickListener(new ToggleLink.ClickListener() {
			public void clicked(boolean toggled) {
				showFilters(toggled);
			}
		});
	}

	private void createFilters(Composite parent) {
		capturedEventFilters = new CapturedEventFilters(outer);
		capturedEventFilters.getControl().setVisible(false);
		GridData gridData = createDefaultGridData();
		gridData.grabExcessVerticalSpace = false;
		gridData.exclude = true;
		capturedEventFilters.getControl().setLayoutData(gridData);
	}

	private void createCapturedEventTree(Composite parent) {
		capturedEventTree = new CapturedEventTree(outer);
		capturedEventTree.getControl().setLayoutData(createDefaultGridData());
		capturedEventTree.setSelectionListener(new CapturedEventTree.SelectionListener() {
			public void selectionChanged(CapturedEventTreeSelection selection) {
				openResource(selection);
			}
		});
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(DIALOG_TITLE);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, "Close", false);
	}

	public void captureEvents() {
		capturedEventTree.removeAll();
		if (eventMonitor == null) {
			eventMonitor = new EventMonitor(eventBroker);
			eventMonitor.setNewEventListener(this);
		}
		eventMonitor.start(capturedEventFilters.getFilters());
		getShell().setText(DIALOG_TITLE + " - capturing...");
	}

	public void stopCaptureEvents() {
		if (eventMonitor != null) {
			eventMonitor.stop();
		}
		getShell().setText(DIALOG_TITLE);
	}

	public void newEvent(CapturedEvent event) {
		capturedEventTree.addEvent(event);
	}

	private void openResource(CapturedEventTreeSelection selection) {
		String name = selection.getSelection();
		if (selection.isParameter()) {
			String[] splitted = selection.getSelection().split("=");
			if (splitted.length == 2) {
				name = splitted[1];
			}
		}

		try {
			PDEUtils.openClass(name);
		} catch(ClassNotFoundException exc) {
			logger.warn(exc.getMessage());
		}
	}

	private void showFilters(boolean filtersVisible) {
		capturedEventFilters.getControl().setVisible(filtersVisible);
		((GridData) capturedEventFilters.getControl().getLayoutData()).exclude = !filtersVisible;

		//Filters have been set and filters UI is not visible so we have to mark it to user
		if (!filtersVisible && capturedEventFilters.hasFilters()) {
			showFiltersLink.setText(new String[] { String.format("%s (%d)", SHOW_FILTER_LINK_TEXT[0],
				capturedEventFilters.getFiltersCount()), SHOW_FILTER_LINK_TEXT[1]});
		} else {
			showFiltersLink.setText(new String[] {SHOW_FILTER_LINK_TEXT[0], SHOW_FILTER_LINK_TEXT[1]});
		}

		outer.layout(false);
	}

	private GridData createDefaultGridData() {
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.verticalSpan = 2;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		return gridData;
	}

	/** for testing/modifying dialog UI
	public static void main(String... args) {
		Display display = new Display ();
		Shell shell = new Shell (display);
		shell.open ();

		SpyDialog dialog = new SpyDialog(shell);

		dialog.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
	}
	*/
}
