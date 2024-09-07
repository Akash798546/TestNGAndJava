package CollectionFramework;

public class Majdoor {
	
	private int salary;
	private String name;
	private int id;
	
	

	public Majdoor(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}



	public String toString() {
		
		return "\tid :"+id +
				"\tName :"+name+
				"\tSalary :"+salary+ " ";
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSalary()
	{
		return salary;
	}

}
