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

import java.io.File;

import org.eclipse.swt.dnd.ByteArrayTransfer;
import org.eclipse.swt.dnd.TransferData;

public class FmodexAudioFileTransfert extends ByteArrayTransfer {
    private static final String AUDIO_FILE_TARGET	= "AUDIO_FILE"; //$NON-NLS-1$
    private static final int AUDIO_FIALE_TARGET_ID		= registerType(AUDIO_FILE_TARGET);
	
	public final static FmodexAudioFileTransfert INSTANCE = new FmodexAudioFileTransfert(); 

	@Override
	public TransferData[] getSupportedTypes() {
		return new TransferData[] {
			FmodexAudioFileTransfertData.INSTANCE,
		};
	}

	@Override
	public boolean isSupportedType(TransferData transferData) {
		if (transferData instanceof FmodexAudioFileTransfertData) {
			for (TransferData d : getSupportedTypes()) {
				if (transferData == d) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	protected int[] getTypeIds() {
		return new int[] { AUDIO_FIALE_TARGET_ID };
	}

	@Override
	protected String[] getTypeNames() {
		return new String[] { AUDIO_FILE_TARGET };
	}

	@Override
	protected void javaToNative(Object object, TransferData transferData) {
		if (object instanceof File) {
			if (transferData instanceof FmodexAudioFileTransfertData) {
			/*
			 	((FmodexAudioFileTransfertData) transferData).setPipe(
					(CmdPipe)object
				);
			*/
			}
		}
	}

	@Override
	protected Object nativeToJava(TransferData transferData) {
		return null; //transferData instanceof FmodexAudioFileTransfertData ? ((FmodexAudioFileTransfertData)transferData).getPipe() : null;
	}

}
