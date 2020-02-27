package com.cts.training.NestedClass;

import java.util.Scanner;

public class AddingArray {
public static void main(String[] args) {
	int i;
	int j;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the value of row");
	int a=scan.nextInt();
	System.out.println("enter the value of column");
	int b=scan.nextInt();
	System.out.println("enter element");
	int arr[][]= new int[a][b];
	for( i=0;i<a;i++) {
		for( j=0;j<b;j++) {
			arr[i][j]=scan.nextInt();
		}
	}
	rowSum(arr,a,b);
	coloumnSum(arr,a,b);
	diagonalSum(arr,a,b);
	SumOfElements(arr,a,b);
}
static void rowSum(int num[][],int row,int coloumn) {
	for(int k=0;k<row;k++) {
		int sum=0;
		for(int j=0;j<coloumn;j++) {
			sum=sum+num[k][j];
		}System.out.println("sum of row is::"+sum);
	}
}static void coloumnSum(int num[][],int row,int coloumn) {
	for(int k=0;k<row;k++) {
		int sum=0;
		for(int j=0;j<coloumn;j++) {
			sum=sum+num[j][k];
		}System.out.println("sum of coloumn is::"+sum);
	}
}static void diagonalSum(int num[][],int row, int coloumn) {
      int sum=0;
	for(int k=0;k<row;k++) {
		for(int j=0;j<coloumn;j++) {
			if(k==j)
				sum=sum+num[k][j];	
		}
			}
		System.out.println("sum of diagonal::"+sum);
	} static void SumOfElements(int num[][],int row,int coloumn) {
		int sum=0;
		int result=0;
		for(int k=0;k<row;k++) {
			for(int j=0;j<coloumn;j++) {
				if(num[k][j]%2==0 && num[k][j]%3==0) {
					result=result+num[k][j];
				}
}
		}
		System.out.println("sum of elements is"+ result);
		}


}
