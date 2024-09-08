package JavaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class TestClass103 {
	public static void main(String[] args) {
	
	int[] ar= {2,8,15,3,6,1,7,2,3,4,9};
	ArrayList list=new ArrayList();
	HashMap<Integer,Integer> map=new HashMap<>();
	for(Integer i:ar)
	{
	map.put(i, map.getOrDefault(i, 0)+1);
	}
		
	for(Map.Entry<Integer, Integer> entry:map.entrySet())
	{
		if(entry.getValue()==1)
		{

          list.add(entry.getKey());
         
			
		}
		
		
	}
	System.out.println(list);
	System.out.println(list.get(list.size()-1));
	
	
	
	
	}
}
