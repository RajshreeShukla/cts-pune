package com.fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String path = "C:\\Users\\admin\\Desktop\\github\\cts-pune\\day 18\\rajj.txt";
		String newPath = "C:\\Users\\admin\\Desktop\\github\\cts-pune\\day 18\\copy.txt";
		File file = new File(path);
		FileInputStream in = new FileInputStream(file);
		BufferedInputStream bin=new BufferedInputStream(in); 
		FileOutputStream out = new FileOutputStream(newPath);
		BufferedOutputStream bout=new BufferedOutputStream(out);
		bout.flush();	
		
		int i;
		while ((i = in.read()) != -1)
			bout.write(i);
		/*
		 * String message = "CTS Training Pune"; byte b[] = message.getBytes();
		 * out.write(b); out.close();
		 */
	}
}