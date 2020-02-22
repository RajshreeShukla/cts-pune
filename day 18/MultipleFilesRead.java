package com.fileHandling;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class MultipleFilesRead {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path1 = "C:\\Users\\admin\\Desktop\\github\\cts-pune\\day 18\\cs.txt";
		String path2 = "C:\\Users\\admin\\Desktop\\github\\cts-pune\\day 18\\Employee.java";
		String path3 = "C:\\Users\\admin\\Desktop\\github\\cts-pune\\day 18\\ec.txt";
		String path4 = "C:\\Users\\admin\\Desktop\\github\\cts-pune\\day 18\\me.txt";
		FileInputStream fin1 = new FileInputStream(path1);
		FileInputStream fin2 = new FileInputStream(path2);
		FileInputStream fin3 = new FileInputStream(path3);
		FileInputStream fin4 = new FileInputStream(path4);
		// ByteArrayOutputStream bout=new ByteArrayOutputStream();
//	String data="This is a common data to be written in the files";
		// byte[] b=data.getBytes();

		Vector vector = new Vector();
		vector.add(fin1);
		vector.add(fin2);
		vector.add(fin3);
		vector.add(fin4);
		Enumeration en = vector.elements();
		SequenceInputStream sid = new SequenceInputStream(en);

	}
}
