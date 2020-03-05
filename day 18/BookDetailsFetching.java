package com.fileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BookDetailsFetching {
	
		public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int choice = 0;
			char c;
			String book_name;
			String author_name;
			String price;
			do {
				System.out.println("\n");
				System.out.println("-------- Book Management Menu -------------");
				System.out.println("1. Add Book Details : ");
				System.out.println("2. Display Book Details : ");
				System.out.println("3. Exit");
				System.out.println("\nEnter your choice : ");
				choice = Integer.parseInt(sc.next());
				switch (choice) {
				case 1:
					System.out.println("\nEnter book name : ");
					book_name = br.readLine();
					System.out.println("\nEnter author name : ");
					author_name = br.readLine();
					System.out.println("\nEnter price : ");
					price = br.readLine();
					writeDataToFile(book_name, author_name, price);
					break;
				case 2:
					System.out.println();
					getDataFromFile();
					break;
				case 3:
					System.exit(0);
				}
				System.out.println("\n\n\nDo you want to continue ? y/n : ");
				c = sc.next().charAt(0);
			} while (c != 'n');
		}
		public static void writeDataToFile(String book_name, String author_name, String price) throws IOException {
			String path = "C:\\Users\\admin\\Desktop\\github\\cts-pune\\day 18\\details.txt";
			FileOutputStream out = new FileOutputStream(path, true);
			BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
			byte[] book = book_name.getBytes();
			byte[] author = author_name.getBytes();
			byte [] pri = price.getBytes();
			String str1 = book_name.concat(" ");
			String str2 = str1.concat(author_name);
			String str3 = str2.concat(" ");
			String str4 = str3.concat(price);
			String str5 = str4.concat("\n");
			byte [] result_string = str5.getBytes();
			out.write(result_string);
			writer.append(" \n");
			out.close();
			System.out.println("Data saved into file succesfully");
		}
		public static void getDataFromFile() throws IOException {
			String path = "C:\\Users\\admin\\Desktop\\github\\cts-pune\\day 18\\detail.txt";
			File file = new File(path);
			FileInputStream input = new FileInputStream(file);
			int i;
			while ((i = input.read()) != -1) {
				System.out.print((char) i);
			}
		}
	}
