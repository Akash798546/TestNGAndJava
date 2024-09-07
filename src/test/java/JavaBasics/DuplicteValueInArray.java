package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class DuplicteValueInArray {
	
	public static void main(String[] args)
	{
		String arry[]= {"java","C++","C","C++","java"};
	int	count=0;
		for (int i = 0; i < arry.length; i++) {
			for (int j = i+1; j < arry.length; j++) {
				if(arry[i]==arry[j])
				{
					
					System.out.println(" " +arry[j] );
					
				}
				
				
			}
			
		}
				
	HashMap<String,Integer> map=new HashMap();
	for(String st:arry)
	{
		
		map.put(st, map.getOrDefault(st, 0)+1);
		
	}
	int max=0;
	for(Integer value:map.values())
	{
		if(max<value)
		{
			max=value;
		}
	}
		
	for(Map.Entry<String, Integer> entry:map.entrySet())
	{
		if(entry.getValue()==max)
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	}

}
