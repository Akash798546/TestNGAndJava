 package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class TestCase101 {
public static void main(String[] args)
{
	String str="hello how are you doing";
	char[] ch=str.toCharArray();
	HashMap<Character,Integer> map=new HashMap();
	for(Character c:ch)
	{
		map.put(c, map.getOrDefault(c, 0)+1);
		
	}
	int max=0;
	for(Integer value:map.values())
	{
		if(value>max)
		{
		max=value;
		}
	}
	for(Map.Entry<Character, Integer> entry:map.entrySet())
	{
		
		if(entry.getValue()==max)
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	
	
	
	
	
}
	
}
