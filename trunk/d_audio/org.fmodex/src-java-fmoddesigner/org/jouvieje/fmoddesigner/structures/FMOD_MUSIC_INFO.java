/**
 * 			NativeFmodEx Project
 *
 * Want to use FMOD Ex API (www.fmod.org) in the Java language ? NativeFmodEx is made for you.
 * Copyright � 2005-2010 J�r�me JOUVIE (Jouvieje)
 *
 * Created on 23 feb. 2005
 * @version file v1.5.0
 * @author J�r�me JOUVIE (Jouvieje)
 * @site   http://jerome.jouvie.free.fr/
 * @mail   jerome.jouvie@gmail.com
 * 
 * INTRODUCTION
 * FMOD Ex is a music and sound effects system, by Firelight Technologies Pty, Ltd.
 * More informations can be found at:
 * 		http://www.fmod.org/
 * The aim of this project is to provide a java interface for this amazing sound API.
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

package org.jouvieje.fmoddesigner.structures;

import org.jouvieje.fmoddesigner.*;
import org.jouvieje.fmodex.exceptions.*;
import org.jouvieje.fmoddesigner.callbacks.*;
import org.jouvieje.fmoddesigner.*;
import org.jouvieje.fmoddesigner.defines.*;
import org.jouvieje.fmoddesigner.enumerations.*;
import org.jouvieje.fmoddesigner.structures.*;
import java.nio.*;
import org.jouvieje.fmodex.*;
import org.jouvieje.fmodex.System;
import org.jouvieje.fmodex.enumerations.*;
import org.jouvieje.fmodex.structures.*;
import org.jouvieje.fmodex.utils.*;

public class FMOD_MUSIC_INFO extends Pointer {
	/**
	 * Create a view of the <code>Pointer</code> object as a <code>FMOD_MUSIC_INFO</code> object.<br>
	 * This view is valid only if the memory holded by the <code>Pointer</code> holds a FMOD_MUSIC_INFO object.
	 */
	public static FMOD_MUSIC_INFO asFMOD_MUSIC_INFO(Pointer pointer) {
		long address = Pointer.getPointer(pointer);
		if(address == 0) return null;
		return new FMOD_MUSIC_INFO(address);
	}
	/**
	 * Allocate a new <code>FMOD_MUSIC_INFO</code>.<br>
	 * The call <code>isNull()</code> on the object created will return false.<br>
	 * <pre><code>  FMOD_MUSIC_INFO obj = FMOD_MUSIC_INFO.allocate();
	 *  (obj == null) <=> obj.isNull() <=> false
	 * </code></pre>
	 */
	public static FMOD_MUSIC_INFO allocate() {
		final long pointer = StructureJNI.FMOD_MUSIC_INFO_new();
		if(pointer == 0) throw new OutOfMemoryError();
		return new FMOD_MUSIC_INFO(pointer);
	}

	protected FMOD_MUSIC_INFO(long pointer) {
		super(pointer);
	}

	/**
	 * Create an object that holds a null <code>FMOD_MUSIC_INFO</code>.<br>
	 * The call <code>isNull()</code> on the object created will returns true.<br>
	 * <pre><code>  FMOD_MUSIC_INFO obj = new FMOD_MUSIC_INFO();
	 *  (obj == null) <=> false
	 *  obj.isNull() <=> true
	 * </code></pre>
	 * To creates a new <code>FMOD_MUSIC_INFO</code>, use the static "constructor" :
	 * <pre><code>  FMOD_MUSIC_INFO obj = FMOD_MUSIC_INFO.allocate();</code></pre>
	 * @see FMOD_MUSIC_INFO#allocate()
	 */
	public FMOD_MUSIC_INFO() {
		super();
	}

	public void release() {
		if(pointer != 0) {
			StructureJNI.FMOD_MUSIC_INFO_delete(pointer);
		}
		pointer = 0;
	}

	/**
	 * [out] True if any streams in the music system are starving.
	 */
	public boolean getStarving() {
		if(pointer == 0) throw new NullPointerException();
		boolean javaResult = StructureJNI.FMOD_MUSIC_INFO_get_starving(pointer);
		return javaResult;
	}

}
