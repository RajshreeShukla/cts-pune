package cognizant.com;

public class StringDemo {
public static void main(String ...args) {
	String city1="Pune";
	String city2="Mumbai";
String city3="Pune";
String city4=new String("Pune");

String city5=new String("Mumbai");

String city6=new String("Pune");

System.out.println(city1==city3);
System.out.println(city3.equals(city6));
System.out.println(city5==city3);
System.out.println(city1.length());
String msg=city1.concat(city2);
System.out.println(msg);}

}

