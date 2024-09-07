package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListToSet {
	
	
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList();
		al.add("Akash");
		al.add("Peter");
		al.add("Tom");
		al.add("Dick");
		al.add("Harry");
		al.add("Akash");
		al.add("Tom");
		
		System.out.println("Original Array :");
		System.out.println(al);
	
		
		System.out.println("Removing Duplicate value from  Array using Treeset");
		Set hs=new HashSet(al);
		System.out.println(hs);
		
		
		System.out.println("Sorting Array using Treeset");
		Set set=new TreeSet(al);
		System.out.println(set);
		
		ArrayList sr=new ArrayList(set);
		al.clear();
		al.addAll(sr);
		System.out.println("The Sorted List is : "+al);
		
		
		
		
		
		
	}

}
