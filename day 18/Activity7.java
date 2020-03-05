package com.fileHandling;
/*Generate a series of first 10 number as follows

   36,34,30,28,24,22,18,16,12,10
*/
public class Activity7 {
public static void main(String[] args) {
	 int num=36;
	 System.out.println(num);
			for(int i=1;i<=10;i++) {
				if(i%2!=0) {
	num=num-2;
		System.out.print(num);	
				}else {
					 num=num-4;
					System.out.print(num);
				}
			}
	}
	
}

