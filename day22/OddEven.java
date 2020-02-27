package com.cts.training.NestedClass;

public class OddEven {
public static void main(String[] args) {
	int arr[]= {10,11,20,33,80};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			System.out.println("odd "+arr[i]);
		}
		if(arr[i]%2==0) {
			System.out.println("even "+arr[i]);
		}
	}
}
}
