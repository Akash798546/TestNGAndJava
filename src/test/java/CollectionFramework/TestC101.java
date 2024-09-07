package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class TestC101 {
	
	
	public static void main(String[] args)
	{
		String s = "akash gupta";
		
		char[] c=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap();
		for(Character ch: c)
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer>  entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
	}

}
