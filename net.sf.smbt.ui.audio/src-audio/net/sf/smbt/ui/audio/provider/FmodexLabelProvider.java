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

package net.sf.smbt.ui.audio.provider;

import net.sf.smbt.fmodex.core.ezaudio.AudioClip;
import net.sf.smbt.fmodex.core.ezaudio.AudioScene;
import net.sf.smbt.fmodex.core.ezaudio.AudioTrack;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Image;

public class FmodexLabelProvider  extends AdapterFactoryLabelProvider {
	static FmodexLabelProvider INSTANCE;
	
	public FmodexLabelProvider() {
		super(new EZAudioCompseableAdapterFactory());
		INSTANCE = this;
	}	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}
	@Override
	public Image getImage(Object element) {
		return super.getImage(element);
	}
	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof AudioScene) {
//			AudioScene scene = (AudioScene) element;
//			if (!scene.getClips().isEmpty() && scene.getClips().size()<columnIndex) {
				return ">" + columnIndex + "<";
//			}
		} else if (element instanceof AudioTrack) {
			return ">" + ((AudioTrack)element).getLabel();
		} else if (element instanceof AudioClip) {
			return ">" + ((AudioClip)element).getLabel();
		}
		return super.getColumnText(element, columnIndex);
	}
	@Override
	public String getText(Object element) {
		return super.getText(element);
	}
}
