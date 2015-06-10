/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.ui.audio.widgets;

import net.sf.smbt.fmodex.core.ezaudio.AudioChannel;
import net.sf.smbt.fmodex.core.ezaudio.AudioProject;
import net.sf.smbt.fmodex.core.ezaudio.AudioTrack;
import net.sf.smbt.fmodex.core.ezaudio.IChannel;
import net.sf.smbt.ui.audio.Activator;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.widgets.vu.UbiKnob;
import net.sf.smbt.ui.widgets.vu.UbiSelectionListener;
import net.sf.smbt.ui.widgets.vu.UbiSlider;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

@SuppressWarnings("unused")
public class XUITrack extends Composite implements IXUIItem {
		private AudioTrack track;
		/*
		private AbletonLiveControllerUtils liveController;
		 */
		private UbiSlider vuSlider;
		private UbiKnob knobPan;
		private Button soloButton, muteButton, stopTrackButton;
		private Image muteOnImage, muteOffImage, soloOnImage, soloOffImage, stoppedImage, stoppableImage;
/*		private UbiKnob knobA, knobB;
 */
		private TreeViewerColumn column;
/*		private UbiPieMeter pie;
*/		
		public XUITrack(Composite parent , AudioTrack track, TreeViewerColumn column, AudioProject p) {
			super(parent, SWT.DOUBLE_BUFFERED);
			this.track = track;
			/*		
			this.liveController = liveController;
			 */
			setLayout(GridLayoutFactory.fillDefaults().create());
			setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).grab(false, true).create());
			setBackground(GUIToolkit.BG);
			this.column		= column;
			
			muteOnImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/mute-on.png").createImage();
			muteOffImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/mute-off.png").createImage();
			soloOnImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/solo-on.png").createImage();
			soloOffImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/solo-off.png").createImage();
			stoppedImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-playback-stop.png").createImage();
			stoppableImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-playback-stop-green.png").createImage();
			
			createContent(this);
		}
		
		private void createContent(Composite parent) {
			
			Composite container = new Composite(parent, SWT.NONE);
			container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
			container.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).grab(false, true).create());
			container.setBackground(GUIToolkit.BG);

			Composite middle = new Composite(container, SWT.DOUBLE_BUFFERED);
			middle.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
			middle.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
			middle.setBackground(GUIToolkit.BG);
			middle.addPaintListener(new PaintListener() {
				@Override
				public void paintControl(PaintEvent e) {
					e.gc.setForeground(GUIToolkit.FG);
					e.gc.drawLine(e.width, 0, e.width-1, e.height);
				}
			});
			
			Composite middleLeft = new Composite(middle, SWT.DOUBLE_BUFFERED);
			middleLeft.setLayout(GridLayoutFactory.fillDefaults().create());
			middleLeft.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());
			middleLeft.setBackground(GUIToolkit.BG);
			
			
			knobPan = new UbiKnob(middleLeft, SWT.HORIZONTAL);
			knobPan.setMax(100f);
			knobPan.setLayout(GridLayoutFactory.fillDefaults().create());
			knobPan.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.BEGINNING, SWT.CENTER).hint(50, 50).grab(false, false).create());
			knobPan.addSelectionListener(new UbiSelectionListener() {
				@Override
				public void handle() {
					float value = new Float(knobPan.getSelection()/100f);
					IChannel aChannel = track.getChannel();
					if (aChannel instanceof AudioChannel) {
						((AudioChannel)aChannel).getFmodex().setPan(value);
					}
				}
			});
			
			Label panLbl = new Label(middleLeft, SWT.NONE);
			panLbl.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).create());
			panLbl.setText("Pan");
			panLbl.setBackground(GUIToolkit.BG);
			panLbl.setForeground(GUIToolkit.FG);
			
			soloButton = new Button(middleLeft, SWT.TOGGLE);
			soloButton.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.CENTER, SWT.CENTER).hint(30, 30).grab(false, false).create());
			soloButton.setImage(soloOffImage);
			soloButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					/*IChannel aChannel = track.getChannel();
					if (aChannel instanceof AudioChannel) {
						((AudioChannel)aChannel).getFmodex().set;
					}*/
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			});
			
			muteButton = new Button(middleLeft, SWT.TOGGLE);
			muteButton.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.CENTER, SWT.CENTER).hint(30, 32).grab(false, false).create());
			muteButton.setImage(muteOffImage);
			muteButton.addSelectionListener(new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					IChannel aChannel = track.getChannel();
					if (aChannel instanceof AudioChannel) {
						((AudioChannel)aChannel).getFmodex().setMute(muteButton.getSelection());
					}	
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			});
			
			Composite middleRight = new Composite(middle, SWT.DOUBLE_BUFFERED);
			middleRight.setLayout(GridLayoutFactory.fillDefaults().create());
			middleRight.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());
			middleRight.setBackground(GUIToolkit.BG);
	
			vuSlider = new UbiSlider(middleRight, SWT.VERTICAL);
			vuSlider.setMax(100f);
			vuSlider.setLayout(GridLayoutFactory.fillDefaults().create());
			vuSlider.setLayoutData(
				GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).
					grab(true, true).hint(20, 150).create()
			);
			vuSlider.addSelectionListener(new UbiSelectionListener() {
				@Override
				public void handle() {
					float value = new Float(vuSlider.getSelection()/100f);
					IChannel aChannel = track.getChannel();
					if (aChannel instanceof AudioChannel) {
						((AudioChannel)aChannel).getFmodex().setVolume(value);
					}	
				}
			});
			
		}
		
		public void dispose() {
			/*
			if (knobA != null && !knobA.isDisposed()) {
				knobA.dispose();
			}
			if (knobB != null && !knobB.isDisposed()) {
				knobB.dispose();
			}
			*/
			if (knobPan != null && !knobPan.isDisposed()) {
				knobPan.dispose();
			}
			if (vuSlider != null && !vuSlider.isDisposed()) {
				vuSlider.dispose();
			}
			if (muteButton != null && !muteButton.isDisposed()) {
				muteButton.dispose();
			}
			if (soloButton != null && !soloButton.isDisposed()) {
				soloButton.dispose();
			}
			
			super.dispose();
		}
		
		public UbiSlider getVuSlider() {
			return vuSlider;
		}
		
		public UbiKnob getKnobPan() {
			return knobPan;
		}
		
}
