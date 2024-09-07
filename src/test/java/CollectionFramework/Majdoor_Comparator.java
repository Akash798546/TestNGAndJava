package CollectionFramework;

import java.util.Comparator;

public class Majdoor_Comparator implements Comparator<Majdoor> {

	@Override
	public int compare(Majdoor o1, Majdoor o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

	
	
	
}
class Salary_Comparator implements Comparator<Majdoor>{

	@Override
	public int compare(Majdoor o1, Majdoor o2) {
		// TODO Auto-generated method stub
		if(o2.getSalary()>o1.getSalary())
		{
			return 1;
		}
		return -1;
	}
	
	
}
