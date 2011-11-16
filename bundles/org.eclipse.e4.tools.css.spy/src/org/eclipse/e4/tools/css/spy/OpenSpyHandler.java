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
import javax.inject.Provider;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.statusreporter.StatusReporter;
import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.eclipse.e4.ui.css.swt.engine.CSSSWTEngineImpl;
import org.eclipse.e4.ui.css.swt.internal.theme.ThemeEngine;
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class OpenSpyHandler {

	@Inject
	@Optional
	protected Display display;

	@Inject
	protected IEclipseContext context;

	@Inject
	protected Provider<StatusReporter> reporter;

	@Execute
    public void openSpy() {
        Control control = display.getCursorControl();
        // it may be that only the shell was selected 
        if (control == null) {
            control = display.getActiveShell();
        }
        CssSpyDialog spy = new CssSpyDialog(control.getShell());
        spy.setSpecimen(control);
		spy.open();
	}

	private CSSEngine findCSSEngine() {
		if(context != null) {
			Object themeEngine = context.get(IThemeEngine.class);
			if(themeEngine instanceof ThemeEngine) { return ((ThemeEngine)themeEngine)
					.getCSSEngine(); }
		}
		if(display != null) {
			Object themeEngine = display.getData("org.eclipse.e4.ui.css.swt.theme");
			if(themeEngine instanceof ThemeEngine) { return ((ThemeEngine)themeEngine)
					.getCSSEngine(); }
		}
		// otherwise just create a copy of the engine.
		return new CSSSWTEngineImpl(display, true);
	}
}
