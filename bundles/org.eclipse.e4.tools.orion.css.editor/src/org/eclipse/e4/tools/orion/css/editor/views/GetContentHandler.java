package org.eclipse.e4.tools.orion.css.editor.views;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.browser.Browser;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

public class GetContentHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchPart part = HandlerUtil.getActivePartChecked(event);
		if (part instanceof SampleCSSView) {
			SampleCSSView view = (SampleCSSView) part;
			final Browser browser = view.getBrowser();
			final Object rc = browser.evaluate("return window.editor.getText();");
			System.out.println(rc);
		}
		return null;
	}

}
