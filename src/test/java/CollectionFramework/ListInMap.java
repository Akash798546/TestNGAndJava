package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ListInMap {
	
	public static void main(String[] args)
	{
		List<String> ls=new ArrayList();
		ls.add("Robert");
		ls.add("John");
		ls.add("Steave");
		ls.add("Dwayne");
		ls.add("Jofra");
		
		Map<String,List<String>> m=new TreeMap<String, List<String>>();
		m.put("Name", ls);
		System.out.println(m );
		
		
		
		
		
	}

}
