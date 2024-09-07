package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

	public static void main(String[] args)
	{
		String s = "qwerty weird";
		String s1=s.replaceAll("\\s+", "");
		char[] arr=s1.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap();
		for(Character c:arr)
		{
		map.put(c, map.getOrDefault(c, 0)+1);	
		}
		int mxfrq=0;
		for(Integer value:map.values())
		{
			if(value>mxfrq)
			{
				mxfrq=value;
			}
			
		}
		for(Map.Entry<Character, Integer> entry :map.entrySet())
		{
			if(entry.getValue()==mxfrq) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}
}
