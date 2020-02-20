package cognizant.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("to");
		list.add("java");
		list.add("Batch");
		list.add("7");
		list.add("true");
		System.out.println(list.add("hye"));
		System.out.println(list.size());
		Iterator<String> it = list.listIterator();
		System.out.println("*****FORWARD DIRECTION*****");
		while (it.hasNext()) {
			String element = it.next();
		
			System.out.println(element);
		if(element.equals("JAVA")) {
			break;
		}
		}
		System.out.println("*****BACKWARD DIRECTION*****");
		while(((ListIterator<String>) it).hasPrevious()) {
			String element=((ListIterator<String>) it).previous();
			System.out.println(element);
			
		}
		for (String obj : list) {
			System.out.println(obj);
			if (obj.equals("Java")) {
				break;
			}

		}
	}
}
