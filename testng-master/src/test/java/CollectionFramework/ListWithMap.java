package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListWithMap {

	
	String name;
	int age;
	String salary;
	
	public ListWithMap(String name,int age,String salary)
	{
		
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	
	public String toString() {
		
		return "\tName : "+name+
				"\tAge : "+age+
				"\tSalary : "+salary+ "\n";
	}
	
	public static void main(String[] args)
	{
	
	Map<String,List<ListWithMap>> mp=new HashMap();
	
	ListWithMap lm=new ListWithMap("John",29,"250000");
	ListWithMap lm1=new ListWithMap("Peter",31,"220000");
	ListWithMap lm2=new ListWithMap("Steave",29,"200000");
	ListWithMap lm3=new ListWithMap("Dwyane",29,"350000");
	
	List<ListWithMap> Engineer=new ArrayList<>();
	Engineer.add(lm);
	Engineer.add(lm1);
	
	List<ListWithMap> Hr=new ArrayList<>();
	Hr.add(lm2);
	Hr.add(lm3);
	
	mp.put("Engineering", Engineer);
	mp.put("Hr", Hr);
	
	for(Map.Entry<String, List<ListWithMap>> entry:mp.entrySet())
	{
		System.out.println(entry.getKey()+" : "+entry.getValue());
		
	}
	}
}
