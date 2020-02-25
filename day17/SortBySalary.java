package cognizant.com;

import java.util.Comparator;

public class SortBySalary implements Comparator<CollectionExample>{

	@Override
	public int compare(CollectionExample o1, CollectionExample o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary()){
			return 1;
		}
		else if(o1.getSalary()==o2.getSalary()){
			return 0;
		}
		else {
			return -1;
		}
		
	}

}
