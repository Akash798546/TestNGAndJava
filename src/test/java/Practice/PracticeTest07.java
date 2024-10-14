package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeTest07 {

	public static void main(String[] args) {
		String[] ar = { "eat", "ate", "tea", "tan", "nat", "ant", "bat" };

		HashMap<String, List<String>> map = new HashMap();
		
		for(String s:ar)
		{
			char[] ch=s.toCharArray();
			Arrays.sort(ch);
			String str=new String(ch);
			if(!map.containsKey(str))
			{
				map.put(str,new ArrayList<>());
			}
			map.get(str).add(s);
			
			
		}
		for(Map.Entry<String, List<String>> entry : map.entrySet() )
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}
