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

package net.sf.smbt.ui.audio.dnd;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DragSourceAdapter;
import org.eclipse.swt.dnd.DragSourceEvent;

public class FmodexAudioFileDragAdapter extends DragSourceAdapter {

	private TreeViewer viewer;
	
	public FmodexAudioFileDragAdapter(TreeViewer treeViewer) {
		this.viewer = treeViewer;
	}

	@Override
	public void dragSetData(DragSourceEvent event) {
		event.dataType = FmodexAudioFileTransfertData.INSTANCE;
	}
	
	@Override
	public void dragStart(DragSourceEvent event) {
		event.dataType = FmodexAudioFileTransfertData.INSTANCE;
		performEZTargetDragSetData(event);
	}
	
   void performEZTargetDragSetData(DragSourceEvent event) {
        if (FmodexAudioFileTransfert.INSTANCE.isSupportedType(event.dataType)) {
            event.data = ((IStructuredSelection) viewer.getSelection()).toArray();
            return;
        }
        if (FmodexAudioFileTransfert.INSTANCE.isSupportedType(event.dataType)) {
            //Object[] pipes = ((IStructuredSelection) viewer.getSelection()).toArray();
            return;
        }
    }
   
   
   

}
