package cognizant.com;
import java.util.Scanner;
public class SumNew {
	public static void main(String[]args) {
	int sum=0;int rem;int div;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a!=0) {
		rem=a%10;
		a=a/10;
		 sum=sum+rem;
		}
		System.out.println("sum= "+sum);
		}

	}

