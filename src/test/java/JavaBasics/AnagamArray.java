 package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagamArray {

	public static void main(String[] args)
	{
		
		String[] ar= {"eat","ate","tea","tan","nat","ant","bat"};
		
		HashMap<String,List<String>> map=new HashMap();
		
		for(String s:ar)
		{
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		String str=new String(ch);
		if(!map.containsKey(str))
		{
		map.put(str, new ArrayList<>());
		}
		//Adding value on the keys
		map.get(str).add(s);
		}
		for(List<String> grp:map.values())
		{
			System.out.println(grp);
		}
		for(Map.Entry<String, List<String>> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
		
		
		
	}
}
