package cognizant.com;

import java.util.Scanner;

public class Activity5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a string");
		String sample = sc.nextLine();
		StringBuffer updatedString = new StringBuffer();
		char[] characters = sample.toCharArray();
		for (int index = 0; index < characters.length; index++) {
		char c = characters[index];
		if (index % 2 != 0) {
					c = Character.toUpperCase(c);
			}
				updatedString.append(c);
		}
		System.out.println("Modified string is: " + updatedString.toString());
	   }
	}
