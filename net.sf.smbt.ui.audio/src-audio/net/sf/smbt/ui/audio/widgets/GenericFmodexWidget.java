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

package net.sf.smbt.ui.audio.widgets;

import net.sf.smbt.fmodex.core.ezaudio.AudioChannel;
import net.sf.smbt.fmodex.core.ezaudio.AudioSound;
import net.sf.smbt.ui.widgets.vu.IGenericParamValuesChangedListener;
import net.sf.smbt.ui.widgets.vu.UbiKnob;
import net.sf.smbt.ui.widgets.vu.UbiKnobGrid;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class GenericFmodexWidget extends AbstractDeviceWidget {
	private UbiKnobGrid knobGrid;
//	private LiveTrack track;
//	private AbstractLiveDevice device;
	
	private IGenericParamValuesChangedListener valueChangeListener;
	
	@SuppressWarnings("unused")
	private AdapterImpl paramAdater;
	
	public Control createControl(Composite parent, int style) {
		if (knobGrid == null || knobGrid.isDisposed()) {
			knobGrid = new UbiKnobGrid(parent, 8, 2);
			paramAdater = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if(msg.getEventType() == Notification.SET) {
						/*
						if (msg.getFeature().equals(EzabletonctrlPackage.eINSTANCE.getLiveParam_Value())) {
							LiveParam p = (LiveParam) msg.getNotifier();
							
							//while (p.eAdapters().contains(paramAdater)) {
							//	p.eAdapters().remove(paramAdater);
							//}
							
							knobGrid.setKnobParameters(
								p.getName(), 
								Float.parseFloat(p.getMin()), 
								Float.parseFloat(p.getMax()), 
								Float.parseFloat((String)msg.getNewValue()), 
								p.getType(),
								false
							);
							
							//p.eAdapters().add(paramAdater);
						}
						*/
					}
				}
			};
			
			valueChangeListener = new IGenericParamValuesChangedListener() {
				@Override
				public void valuesChanged(float level, float value, float min, float max, String key, boolean enabled) {
					/*
					if (track != null && device != null) {
						synchronized (device) {
							for (LiveParam p : device.getParameters()) {
								if (p.getName() != null) {
									if (p.getName().equals("" + key)) {
										if (!new Float(value).equals(Float.NaN)) {
											Float fVal = new Float(1 - (max - value) / (max - min));
											p.setValue(""+fVal);
										}
									} 
								}
							}
						}
					}
					*/
				}
			};
		}
		return knobGrid;
	}
	
	public UbiKnob getKnob(String pID) {
		if (pID != null && knobGrid != null && knobGrid.getKnob(pID) != null) {
			return knobGrid.getKnob(pID).getKnob();
		}
		return null;
	}
	
	@Override
	public void disposeControl(Composite parent, int style) {
	/*
	 	for (LiveParam p : device.getParameters()) {
			p.eAdapters().remove(paramAdater);
		}
	 */
		knobGrid.dispose();
		knobGrid = null;
	}
	
	@Override
	public void redraw() {
		if (knobGrid == null || knobGrid.isDisposed()) {
			knobGrid.layout(true);
			knobGrid.redraw();
		}		
	}

	@Override
	public String getID() {
		return "Generic Device";
	}

	@Override
	public void init(AudioChannel aChannel, AudioSound aSound) {
		if (knobGrid != null && !knobGrid.isDisposed()) {
			if (!knobGrid.getValuesChangedListeners().contains(valueChangeListener)) {
				knobGrid.addValuesChangedListeners(valueChangeListener);
			}
			//eq.clearAll();
			/*
			for (LiveParam p : device.getParameters()) {
				String v	= p.getValue();
				String min	= p.getMin();
				String max	= p.getMax();
				String t	= p.getType();
				String n	= p.getName();
				

				Float f = Float.parseFloat(v!=null && v!="" ? v : "0f");
				Float minF = min == null ? 0f : Float.parseFloat(min);
				Float maxF = max == null ? 0f : Float.parseFloat(max);
				Float fVal = new Float(1 - (maxF - f) / (maxF - minF));
					

				//if (!p.eAdapters().contains(paramAdater)) {
				//	p.eAdapters().add(paramAdater);
				//}
			}
			*/
		}
	}
	
	
	@Override
	public void refresh(AudioChannel aChannel, AudioSound aSound) {
		init(aChannel, aSound);
		knobGrid.redraw();
	}
}
