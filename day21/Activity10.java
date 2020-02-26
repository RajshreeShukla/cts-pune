package cognizant.com;

import java.sql.Array;
import java.util.Scanner;

public class Activity10 {
	public static void main(String[] args) {
		
		// System.out.println("Enter the length of array");
		
		int[] arr = {2,4,33,16,24,5,8,18,24}; 
		int oddcount = 0;
		int evencountf = 0;
		int evencountb = 0;

		for (int i = 0; i > arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddcount++;
			}
		}
		for (int i = 0; i > arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evencountf++;
			} else {
				break;
			}
		}
		for (int i = arr.length - 1; i > 0; i++) {
			if (arr[i] % 2 == 0) {
				evencountb++;
			} else {
				break;
			}
		}
		if (evencountf == evencountb && oddcount > 1) {
			System.out.println("it is daphne array");
		} else {
			System.out.println("not a daphne array");
		}
System.out.println(oddcount);
System.out.println(evencountf);
System.out.println(evencountb);
	}
}
