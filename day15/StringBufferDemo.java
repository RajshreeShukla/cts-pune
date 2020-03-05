package cognizant.com;

public class StringBufferDemo {
public static void main(String[]args) {
	StringBuffer sb=new StringBuffer();
	System.out.println(sb.capacity());
	System.out.println(sb.append("hye this is seed infotech"));
	System.out.println(sb.capacity());
	System.out.println(sb.append(" The institute fro trainees"));
    System.out.println(sb.capacity());
    System.out.println(sb.insert(3," dear"));
    System.out.println(sb.replace(3, 16, "will not"));
    System.out.println(sb.delete(15,20));
    System.out.println(sb);
    System.out.println(sb.reverse());
}
}
