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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class FmodexWidgetManager {
	
	public final static FmodexWidgetManager INSTANCE = new FmodexWidgetManager();

	private Map<String, AbstractDeviceWidget> abletonWidgetsMap;
	private GenericFmodexWidget 	genericWidget;
	private NullFmodexWidget 		nullWidget;
	
	public FmodexWidgetManager() {
		abletonWidgetsMap 	= getAbletonWidgets();
		genericWidget 		= new GenericFmodexWidget();
		nullWidget 			= new NullFmodexWidget();
	}
	
	public NullFmodexWidget getNullWidget() {
		return nullWidget;
	}
	
	public Map<String, AbstractDeviceWidget> getAbletonWidgets() {
		Map<String, AbstractDeviceWidget> abletonWidgetsMap = new HashMap<String, AbstractDeviceWidget>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("net.sf.smbt.ui.audio.device");
		if (point == null) return null;
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
				String ID = elem.getAttribute("ID");
				ID = ID.trim();
				AbstractDeviceWidget device = null;
				try {
					device = (AbstractDeviceWidget) elem.createExecutableExtension("widget");
				} catch (CoreException e) {
					e.printStackTrace();
				}
				if (device instanceof AbstractDeviceWidget) {
					if (!abletonWidgetsMap.containsKey(ID)) {
						abletonWidgetsMap.put(ID, device);
					}
				}
			}
		}
		return abletonWidgetsMap;
	}
	
	public AbstractDeviceWidget getWidget(String ID) {
		if (abletonWidgetsMap == null || !abletonWidgetsMap.containsKey(ID)) {
			return genericWidget;
		}
		return abletonWidgetsMap.get(ID);
	}
}
