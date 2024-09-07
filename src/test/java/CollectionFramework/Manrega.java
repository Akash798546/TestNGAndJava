package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class Manrega {
	
	public static void main(String[] args)
	{
		TreeSet<Majdoor> ts=new TreeSet(new Salary_Comparator());
		Majdoor mj1=new Majdoor(101, "Pater", 12500);
		Majdoor mj2=new Majdoor(102, "Tom", 22500);
		Majdoor mj3=new Majdoor(103, "Dick", 32500);
		Majdoor mj4=new Majdoor(104, "Harry", 33500);
		Majdoor mj5=new Majdoor(105, "Aryan", 2500);
		Majdoor mj6=new Majdoor(106, "Binod", 126500);
		
		
		ts.add(mj1);
		ts.add(mj2);
		ts.add(mj3);
		ts.add(mj4);
		ts.add(mj5);
		ts.add(new Majdoor(106, "Binod", 126500));
		 
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
