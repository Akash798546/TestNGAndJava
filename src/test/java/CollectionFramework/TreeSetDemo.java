package CollectionFramework;

import java.util.TreeSet;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class TreeSetDemo {
	
	public static void main(String[] args)
	{
		TreeSet<Employee> set=new TreeSet(new EmpComp());
		
		Employee em1=new Employee(123,"Peter Parker",150000);
		Employee em2=new Employee(124,"Chrish  Evan",160000);
		Employee em3=new Employee(125,"Tony  Stark",175000);
		Employee em4=new Employee(126,"Shaktiman",175000);
		Employee em5=new Employee(127,"Junior G",100000);
		
		set.add(em1);
		set.add(em2);
		set.add(em3);
		set.add(em4);
		set.add(em5);
		set.add(new Employee(128,"Hulk",110000));
		
		TreeSet<Employee> st=new TreeSet(new EmpComp2());
		

		
		st.add(em1);
		st.add(em2);
		st.add(em3);
		st.add(em4);
		st.add(em5);
		st.add(new Employee(128,"Hulk",110000));
		
		
		
		//printing wit ascending order of name
		
	java.util.Iterator<Employee> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("*******************************************");
		java.util.Iterator<Employee> itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
