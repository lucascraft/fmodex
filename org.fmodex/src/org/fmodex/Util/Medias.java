/*
 * Created on 20 janv. 08
 */
package org.fmodex.Util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Medias
{
	private static String lastError = "";
	private Medias(){}
	
	public static ByteBuffer loadMediaIntoMemory(String media)
	{
		try
		{
			InputStream is = new FileInputStream(new File(media));
			BufferedInputStream bis = new BufferedInputStream(is);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			byte[] bytes = new byte[4*1024];
			int read;
			while((read = bis.read(bytes, 0, bytes.length)) != -1) {
				baos.write(bytes, 0, read);
			}
			bis.close();

			ByteBuffer buffer = org.jouvieje.fmodex.utils.BufferUtils.newByteBuffer(baos.size());
			buffer.put(baos.toByteArray());
			buffer.rewind();
			
			lastError = "";
			
			return buffer;
		}
		catch(IOException e)
		{
			lastError = e.getMessage();
			return null;
		}
	}
	
	public static String getLastError()
	{
		return lastError;
	}
}
