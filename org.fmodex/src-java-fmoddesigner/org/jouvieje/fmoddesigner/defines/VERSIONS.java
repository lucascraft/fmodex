/**
 * 				NativeFmodEx Project
 *
 * Want to use FMOD Ex API (www.fmod.org) in the Java language ? NativeFmodEx is made for you.
 * Copyright � 2005-2010 J�r�me JOUVIE (Jouvieje)
 *
 * Created on 23 feb. 2005
 * @version file v1.0.0
 * @author J�r�me JOUVIE (Jouvieje)
 * @site   http://jerome.jouvie.free.fr/
 * @mail   jerome.jouvie@gmail.com
 * 
 * 
 * INTRODUCTION
 * FMOD Ex is an API (Application Programming Interface) that allow you to use music
 * and creating sound effects with a lot of sort of musics.
 * FMOD is at :
 * 		http://www.fmod.org/
 * The reason of this project is that FMOD Ex can't be used direcly with Java, so I've created
 * this project to do this.
 * 
 * 
 * GNU LESSER GENERAL PUBLIC LICENSE
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1 of the License,
 * or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the
 * Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307 USA 
 */

package org.jouvieje.fmoddesigner.defines;

public interface VERSIONS
{
	/**
	 * FMOD EventSystem version number.  Check this against FMOD::EventSystem::getVersion.<BR>
	 * 0xaaaabbcc -> aaaa = major version number.  bb = minor version number.  cc = development version number.
	 */
	public final static int FMOD_EVENT_VERSION = VersionsJNI.get_FMOD_EVENT_VERSION();
	/**
	 * FMOD NetEventSystem version number.  Check this against NetEventSystem_GetVersion.<BR>
	 * 0xaaaabbcc -> aaaa = major version number.  bb = minor version number.  cc = development version number.<BR>
	 * <U>Remark :</U> always return the same value than <code>FMOD_EVENT_VERSION</code>.
	 */
	public final static int FMOD_EVENT_NET_VERSION = VersionsJNI.get_FMOD_EVENT_NET_VERSION();

	/**
	 * NativeFmodDesigner jar version.<br>
	 * 0xaaaabbcc -> aaaa = major version number.  bb = minor version number.  cc = development version number.
	 */
	public final static int NATIVEFMODDESIGNER_JAR_VERSION = VersionsJNI.get_NATIVEFMODDESIGNER_JAR_VERSION();
	/**
	 * NativeFmodDesigner library version.<br>
	 * 0xaaaabbcc -> aaaa = major version number.  bb = minor version number.  cc = development version number.
	 */
	public final static int NATIVEFMODDESIGNER_LIBRARY_VERSION = VersionsJNI.get_NATIVEFMODDESIGNER_VERSION();
}