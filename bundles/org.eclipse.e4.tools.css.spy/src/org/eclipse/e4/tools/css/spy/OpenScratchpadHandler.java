package org.eclipse.e4.tools.css.spy;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

public class OpenScratchpadHandler {
	@Execute
	public void open(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell,
			IThemeEngine themeEngine) {
		CSSScratchPadWindow scratchpad = new CSSScratchPadWindow(shell, themeEngine);
		scratchpad.open();
	}
}
