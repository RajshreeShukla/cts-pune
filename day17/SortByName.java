package cognizant.com;

import java.util.Comparator;

public class SortByName implements Comparator<CollectionExample> {

	@Override
	public int compare(CollectionExample o1, CollectionExample o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId()) {
		return 1;
	}
		else if(o1.getId()==o2.getId())
		{
			return 0;
		}
		else{
			return 0;
		}
		}

}
