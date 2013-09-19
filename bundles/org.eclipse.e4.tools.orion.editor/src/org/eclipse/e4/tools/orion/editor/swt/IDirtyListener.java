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
package org.eclipse.e4.tools.orion.editor.swt;

/**
 * Listener to observe the dirty changed.
 */
public interface IDirtyListener {

	/**
	 * call when dirty changed.
	 * 
	 * @param dirty
	 */
	void dirtyChanged(boolean dirty);
}
