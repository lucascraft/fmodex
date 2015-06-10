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

package net.sf.smbt.ui.audio.view;

import static org.jouvieje.fmodex.defines.FMOD_MODE.FMOD_DEFAULT;
import static org.jouvieje.fmodex.defines.FMOD_MODE.FMOD_LOOP_NORMAL;
import static org.jouvieje.fmodex.defines.FMOD_MODE.FMOD_OPENMEMORY;
import static org.jouvieje.fmodex.defines.FMOD_MODE.FMOD_SOFTWARE;
import net.sf.smbt.fmodex.core.AudioUtils;
import net.sf.smbt.fmodex.core.ezaudio.AudioChannel;
import net.sf.smbt.fmodex.core.ezaudio.AudioSound;
import net.sf.smbt.fmodex.core.ezaudio.DSP_KIND;
import net.sf.smbt.fmodex.core.ezaudio.FMDSP;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;


public class AudioPreviewView extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(GridLayoutFactory.fillDefaults().create());
		parent.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		AudioChannel aChannel = AudioUtils.INSTANCE.createChannel();
		
		FMDSP dsp = AudioUtils.INSTANCE.createDSP(
			DSP_KIND.ECHO, 
			0f, 
			1f, 
			0.5f
		);
		AudioUtils.INSTANCE.addDSP(
			dsp
		);
		AudioSound aSound1 = AudioUtils.INSTANCE.createSound(
			"/Media/drumloop.wav", 
			FMOD_DEFAULT | FMOD_SOFTWARE | FMOD_LOOP_NORMAL | FMOD_OPENMEMORY
		);
		AudioSound aSound2 = AudioUtils.INSTANCE.createSound(
			"/Media/sample1.mp3", 
			FMOD_DEFAULT | FMOD_SOFTWARE | FMOD_LOOP_NORMAL | FMOD_OPENMEMORY
		);
		AudioUtils.INSTANCE.playSound("C:\\Users\\Dev1\\workspace\\net.sf.smbt.fmodex.core\\Media\\buzz.wav");
		AudioUtils.INSTANCE.playSound(
			aSound2, 
			aChannel
		);
	}	

	@Override
	public void dispose() {
		super.dispose();
		AudioUtils.INSTANCE.end();
	}
	
	@Override
	public void setFocus() {

	}

}
