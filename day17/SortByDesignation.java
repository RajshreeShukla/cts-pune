package cognizant.com;

import java.util.Comparator;

public class SortByDesignation implements Comparator<CollectionExample>
{

	@Override
	public int compare(CollectionExample o1, CollectionExample o2) {
		// TODO Auto-generated method stub
		return o1.getDesig().compareTo(o2.getDesig());
	}

}
