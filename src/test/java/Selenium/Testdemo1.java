package Selenium;

import java.util.HashMap;
import java.util.Map;

public class Testdemo1 {
	
	static String str;
	public static void main(String[] args)
	{
		str="my name is akash is name akash";
		HashMap<String,Integer> map=new HashMap();
		String[] st=str.split("\\s");
		for(int i=0;i<st.length;i++)
		{
			map.put(st[i], map.getOrDefault(st[i], 0)+1);
			
		}
		
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
		
		
	}
	

}
