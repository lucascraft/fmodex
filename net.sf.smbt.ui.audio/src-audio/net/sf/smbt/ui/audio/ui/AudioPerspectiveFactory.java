/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.ui.audio.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class AudioPerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.setFixed(false);
		
		IFolderLayout projectFolderLayout = layout.createFolder("projectFolder", IPageLayout.LEFT, 0.3f, editorArea);
		projectFolderLayout.addView("net.sf.smbt.ui.navigator");
		
		IFolderLayout topologyFolderLayout = layout.createFolder("topologyFolder", IPageLayout.RIGHT, 0.7f, editorArea);
		topologyFolderLayout.addView("net.sf.smbt.ui.audio.AudioView");
		topologyFolderLayout.addView("net.sf.smbt.ui.audio.fmodexLive");
		
		//IFolderLayout bottomFolder = layout.createFolder("bottomFolder", IPageLayout.BOTTOM, 0.33f, editorArea);
		//bottomFolder.addView("org.eclipse.ui.browser.view");
		//bottomFolder.addView("org.eclipse.ui.console.ConsoleView");
	}
}
