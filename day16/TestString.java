package cognizant.com;

public class TestString {
public static void main(String ...args) {
	String msg="I am a Engineer";
	String year="of 2020";
	System.out.println(msg.substring(8));
	System.out.println(msg.indexOf("e"));
	System.out.println(msg.compareTo(year));
	System.out.println(msg.endsWith("y"));
	System.out.println(msg.substring(4));
	System.out.println(msg.substring(4, 10));
	System.out.println(msg.replaceFirst(msg,year));
	System.out.println(msg.startsWith("a"));
	System.out.println(msg.concat(year));
}
}
