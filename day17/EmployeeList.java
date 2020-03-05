package cognizant.com;

import java.util.ArrayList;
import java.util.Collections;

import com.sun.source.tree.NewArrayTree;

public class EmployeeList {
public static void main(String[] args) {
	ArrayList<CollectionExample>list=new ArrayList<>();
	addCollectionExample(list);
	SortById sbi=new SortById();
	SortByFirstName sbf =new SortByFirstName();
	SortByDesignation sbd=new SortByDesignation();
	//SortBySalary slr=new SortBySalary();
	Collections.sort(list, sbf);
	for(CollectionExample cep:list) {
		//System.out.println(list);
	System.out.println(cep);
	}
}

private static void addCollectionExample(ArrayList<CollectionExample>list) {
	// TODO Auto-generated method stub
	CollectionExample emp1=new CollectionExample(4545,"Vijay","Bangalore","Developer",21,4168.67,536442l);
	CollectionExample emp2=new CollectionExample(4546,"Neeraj","Pune","Programmer",22,57698,536442l);
	CollectionExample emp3=new CollectionExample(4544,"Varun","Hyderabad","Tester",23,89456,57442l);
	CollectionExample emp4=new CollectionExample(4548,"Tarun","Chennai","Modifier",24,873990,536442l);
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	list.add(emp4);
	
}

}
