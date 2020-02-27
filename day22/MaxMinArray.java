package com.cts.training.NestedClass;

public class MaxMinArray {
	public static void main(String[] args) {
		int arr[] = { 10, 60, 30, 40, 50 };
		int max = getMax(arr);
		int min=getMin(arr);
		System.out.println("max is= "+max );
		System.out.println("min is= "+min);

	}

	private static int getMax(int[] arr) {
		int maxarr = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maxarr < arr[i]) {
				maxarr = arr[i];
			}
	}
		return maxarr;
	}

	 public static int getMin(int[] arr){ 
		   int minarr= arr[0]; 
		    for(int i=1;i<arr.length;i++){ 
		      if(arr[i] < minarr){ 
		        minarr = arr[i]; 
		      } 
		    } 
		    return minarr; 
}
	 
}
