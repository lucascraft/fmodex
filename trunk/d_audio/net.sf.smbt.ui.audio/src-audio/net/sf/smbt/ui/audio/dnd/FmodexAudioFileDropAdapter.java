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

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TransferData;

public class FmodexAudioFileDropAdapter extends DropTargetAdapter {

	public FmodexAudioFileDropAdapter(Viewer viewer) {
	}

	
	@Override
	public void drop(DropTargetEvent event) {
		super.drop(event);
	}
	
	public boolean performDrop(Object data) {
//		if (data instanceof EZMojoTarget) {
//			return true;
//		}
		return false;
	}
	
	public boolean validateDrop(Object target, int operation, TransferData transferType) {
		/*
		if (target instanceof EZMojoNode) {
			EZMojoNode node = (EZMojoNode) target;
			if (operation == DND.DROP_MOVE || operation == DND.DROP_COPY) {
				if (transferType instanceof FmodexAudioFileTransfertData) {
					EzMojoCmdUtils.INSTANCE.addMojoForward(
						node, 
						((FmodexAudioFileTransfertData)transferType).getPipe()
					);
					return true;
				}
			}
		}
		*/
		return false;
	}
	@Override
	public void dropAccept(DropTargetEvent event) {
		// TODO Auto-generated method stub
		super.dropAccept(event);
	}
	@Override
	public void dragEnter(DropTargetEvent event) {
		// TODO Auto-generated method stub
		super.dragEnter(event);
	}
	@Override
	public void dragLeave(DropTargetEvent event) {
		// TODO Auto-generated method stub
		super.dragLeave(event);
	}
	@Override
	public void dragOperationChanged(DropTargetEvent event) {
		// TODO Auto-generated method stub
		super.dragOperationChanged(event);
	}
	@Override
	public void dragOver(DropTargetEvent event) {
		// TODO Auto-generated method stub
		super.dragOver(event);
	}
}
