package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class DemoTest {

	public static void main(String[] args)
	{
		
		int[] a= {1,2,3,4,5,5,9,9,9,2,1,1};
		
		HashMap<Integer,Integer> map=new HashMap();
		
		for(Integer in:a)
		{
			map.put(in, map.getOrDefault(in, 0)+1);
			
		}
		
		for(Map.Entry<Integer,Integer> entry :map.entrySet() )
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
			
		}
		
	}
}
