package CollectionFramework;

public class Employee {

	private int empid;
	private String empName;
	private double sal;
	
	public Employee(int empid,String empName,double sal)
	{
		this.empid=empid;
		this.empName=empName;
		this.sal=sal;
		
	}
	
	public String toString()
	{
		return "\tEmp id: "+empid+
				"\tEmp Name: "+empName+
				"\tSalary: "+sal+ "\n";
	}
	
	public double getSalary()
	{
		return sal;
	}
	public String getEmpName()
	{
		return empName;
	}
	
}
