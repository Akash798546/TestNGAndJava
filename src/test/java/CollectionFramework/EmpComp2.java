package CollectionFramework;

import java.util.Comparator;

public class EmpComp2 implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2)
	{
		 if(e2.getSalary()>e1.getSalary())
		 {
			 return 1;
			 
		 }
		 else
		 {
			 return -1;
		 }
	}


}
