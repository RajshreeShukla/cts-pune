package cognizant.com;

import java.util.*;

public class StringExample {
	public static void main(String... args) {
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sortString(str);
	}

	static void sortString(String src) {
		char[] a = src.toCharArray();
		Arrays.parallelSort(a);
		System.out.println(String.copyValueOf(a));
	}
}
