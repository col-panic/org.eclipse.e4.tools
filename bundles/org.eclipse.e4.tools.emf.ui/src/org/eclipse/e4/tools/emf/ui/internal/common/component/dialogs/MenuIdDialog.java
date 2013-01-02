/*******************************************************************************
 * Copyright (c) 2013 MEDEVIT, FHV and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Marco Descher <marco@descher.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.tools.emf.ui.internal.common.component.dialogs;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.e4.tools.emf.ui.common.IModelResource;
import org.eclipse.e4.tools.emf.ui.internal.Messages;
import org.eclipse.e4.tools.emf.ui.internal.PatternFilter;
import org.eclipse.e4.tools.emf.ui.internal.common.component.ControlFactory;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuContribution;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.impl.MenuPackageImpl;
import org.eclipse.e4.ui.model.fragment.MModelFragments;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class MenuIdDialog extends TitleAreaDialog {

	private EModelService modelService;
	private TableViewer viewer;
	private EditingDomain domain;
	private IModelResource resource;
	private MMenuContribution menuContribution;
	private Messages messages;

	public MenuIdDialog(Shell parentShell, IModelResource resource, MMenuContribution menuContribution, EditingDomain domain, EModelService modelService, Messages Messages) {
		super(parentShell);
		this.resource = resource;
		this.modelService = modelService;
		this.messages = Messages;
		this.domain = domain;
		this.menuContribution = menuContribution;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		getShell().setText(messages.MenuIdDialog_ShellTitle);
		setTitle(messages.MenuIdDialog_DialogTitle);
		setMessage(messages.MenuIdDialog_DialogMessage);
		Composite comp = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(comp, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		container.setLayout(new GridLayout(2, false));

		Label l = new Label(container, SWT.NONE);
		l.setText(messages.MenuIdDialog_Id);

		Text idField = new Text(container, SWT.BORDER | SWT.SEARCH | SWT.ICON_SEARCH);
		idField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		final PatternFilter filter = new PatternFilter() {
			@Override
			protected boolean isParentMatch(Viewer viewer, Object element) {
				return viewer instanceof AbstractTreeViewer && super.isParentMatch(viewer, element);
			}
		};

		l = new Label(container, SWT.NONE);
		viewer = new TableViewer(container);
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new LabelProviderImpl());
		viewer.addFilter(filter);
		viewer.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(DoubleClickEvent event) {
				okPressed();
			}
		});

		ControlFactory.attachFiltering(idField, viewer, filter);

		if (resource.getRoot().get(0) instanceof MApplication) {
			List<MUIElement> list = new ArrayList<MUIElement>();
			// include Window main-menu instances
			MApplication ma = ((MApplication) resource.getRoot().get(0));
			for (MWindow m : ma.getChildren()) {
				list.add(m.getMainMenu());
			}
			// include menu elements located within parts
			List<MPart> mp = modelService.findElements(ma, null, MPart.class, null);
			for (MPart mPart : mp) {
				list.addAll(mPart.getMenus());
			}
			// include menu elements carried by tool items
			List<MToolItem> mt = modelService.findElements(ma, null, MToolItem.class, null);
			for (MToolItem mToolItem : mt) {
				if (mToolItem.getMenu() != null)
					list.add(mToolItem.getMenu());
			}
			viewer.setInput(list);
		} else if (resource.getRoot().get(0) instanceof MModelFragments) {
			List<MApplicationElement> list = new ArrayList<MApplicationElement>();
			for (MApplicationElement f : ((MModelFragments) resource.getRoot().get(0)).getImports()) {
				if (f instanceof MMenu) {
					list.add(f);
				}
			}
			viewer.setInput(list);
		}

		return comp;
	}

	@Override
	protected void okPressed() {
		if (!viewer.getSelection().isEmpty()) {
			MMenu el = (MMenu) ((IStructuredSelection) viewer.getSelection()).getFirstElement();
			Command cmd = SetCommand.create(domain, menuContribution, MenuPackageImpl.Literals.MENU_CONTRIBUTION__PARENT_ID, el.getElementId());
			if (cmd.canExecute()) {
				domain.getCommandStack().execute(cmd);
				super.okPressed();
			}
		}
	}

	static class LabelProviderImpl extends StyledCellLabelProvider {
		@Override
		public void update(ViewerCell cell) {
			MMenu el = (MMenu) cell.getElement();
			StyledString str = new StyledString(el.getElementId());
			str.append(" - " + el.getLabel(), StyledString.DECORATIONS_STYLER); //$NON-NLS-1$
			cell.setText(str.getString());
			cell.setStyleRanges(str.getStyleRanges());
		}
	}
}