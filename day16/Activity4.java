package cognizant.com;

import java.util.*;

public class Activity4 {
	public static void main(String[]args) {
	System.out.println("Enter a String");
	Scanner scan= new Scanner(System.in);
	String a= scan.nextLine();
	System.out.println(toggleString(a));
}
  public static String toggleString(String sentence)
    {
       String toggled = "";
       for(int i=0; i<sentence.length(); i++)
       {
           char letter = sentence.charAt(i);
           if(i%2==0)
           {
                letter = Character.toLowerCase(letter);
                toggled = toggled + letter;
           }
           else
           {
               letter = Character.toUpperCase(letter);
               toggled = toggled + letter;
           }
       }
       return toggled;
}}
