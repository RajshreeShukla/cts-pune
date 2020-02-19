package cognizant.com;

import java.util.*;

public class Activity2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lower no");
		int llim = sc.nextInt();
		System.out.println("enter upper no");
		int ulim = sc.nextInt();
		int count = 0;
		for (int i = llim; i <= ulim; i++) {
			int number = i;
			while (number != 0) {
				int digit = number % 10;
				if (digit == 1) {
					count++;
				}
				number = number / 10;
			}
		}
		System.out.println(count);

	}

}
