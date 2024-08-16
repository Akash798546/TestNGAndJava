package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	
	String name;
	String Salary;
	
	
	
	public MapDemo(String name,String Salary) {
		
		this.name=name;
		this.Salary=Salary;
	}
		
	public String toString()
	{
		return "\tName : "+name+
				"\tSalary : "+Salary+ "\n";
				
		
	}
	
	public static void main(String[] args)
	{
		
		Map<String,Object> em=new HashMap<>();
		
		MapDemo md=new MapDemo("Akash", "175000");
		MapDemo md1=new MapDemo("Peter", "125000");
		MapDemo md2=new MapDemo("Hulk", "100000");
		MapDemo md3=new MapDemo("Batman", "120000");
		MapDemo md4=new MapDemo("IronMan", "200000");
		MapDemo md5=new MapDemo("Thor", "250000");
		
		em.put("102", md);
		em.put("103", md1);
		em.put("104", md2);
		em.put("105", md3);
		em.put("106", md4);
		em.put("107", md5);
		
		for(Map.Entry<String, Object> entry:em.entrySet())
		{
		System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
	

}
