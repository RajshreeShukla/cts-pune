package com.fileHandling;

import java.io.File;

public class FileFirst {
public static void main(String[] args) {
	String path="C:\\Users\\admin\\Desktop\\github\\cts-pune\\day 18\\rajj.txt";
	File file=new File(path);
	System.out.println("File Name :" +file.getName());
	System.out.println("File length :" +file.length());
	System.out.println("Parent Name :" +file.getParent());
	System.out.println("Path is :" +file.getPath());
}
}
