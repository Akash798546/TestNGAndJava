package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.list.TreeList;

public class ArrayToArrayList {
	
	public static void main(String[] args)
	{
		int a[]= {2,4,3,6,5,7,8,9};
		System.out.println(Arrays.toString(a));
		 Integer[] integerArray = Arrays.stream(a).boxed().toArray(Integer[]::new);
		 String[] strArray=Arrays.stream(a).mapToObj(String::valueOf).toArray(String[]::new);
		
		List<String> list=new TreeList<>(Arrays.asList(strArray));
		
		list.add("15");
		list.add("13");
		
	System.out.println(list);
	
	
	
	//Converting Arraylist to array
	ArrayList<String> al=new ArrayList();
	
	al.add("Akash");
	al.add("Peter");
	al.add("Piyush");
	al.add("Badmosh");
	al.add("Rahul");
	String[] as=al.toArray(new String[al.size()]);
	System.out.println(Arrays.toString(as));
	
	
	String[] strg= {"Apple","Oranges","Mango","Banana","Mango","Apple"};
	
	List<String> strList=new ArrayList(Arrays.asList(strg));
	strList.add("Pineapple");
	System.out.println(strList);
	
	Set set=new TreeSet(strList);
	System.out.println(set);
	
	List newlist=new ArrayList(set);
	strList.clear();
	strList.addAll(newlist);
	
	System.out.println(al);
	String[] strA=strList.toArray(new String[strList.size()]);
	System.out.println(Arrays.toString(strA));
	
	
	
		
	}

}
