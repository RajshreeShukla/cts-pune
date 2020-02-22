package com.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadChar {
	public static void main(String[]args) throws IOException{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter name to find details: ");
		String word=input.next();
		FileReader f=new FileReader("C:\\Users\\admin\\Desktop\\github\\cts-pune\\day 18\\detail.txt");
		//FileReader freader = new BufferedReader((f));
		String st="Alaska \r\n" + 
				"price=200\r\n" + 
				"related to green lights in Neitherland	\r\n" ;
		int count=0;
		String s;
		while((s =word) != null) {
	//	String[] st = s.split(" ");
		String book_name= "alaska";
		//String author_name = st[1];
	//	String price = st[2];
		if(book_name.equals(word)){
		int i;
		while((i=f.read())!=-1) {
			
		
		
	System.out.println((char)i);
		}}
		}
	}}


