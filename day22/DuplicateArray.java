package com.cts.training.NestedClass;

import java.util.Scanner;

public class DuplicateArray {
	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		int count = 0;
		System.out.println("duplicate elements in aray");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
				
					System.out.println(arr[j]);
			}
		}

	}
}
