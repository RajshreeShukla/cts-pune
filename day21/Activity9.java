package cognizant.com;

import java.util.Scanner;

public class Activity9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int s = sc.nextInt();
		System.out.println(SumAll(s));
	}

	private static int SumAll(int i) {
		int sum = 0;
		int count=0;
		while (i > 0 || sum > 9) {
			if (i == 0) {
				i = sum;
				sum=0;
             
			}
		
			sum += i % 10;
			i /= 10;
		
			
		}
		return sum;
				
		
	}
}