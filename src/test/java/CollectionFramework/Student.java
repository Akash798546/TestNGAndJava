package CollectionFramework;

public class Student {
	
	int id;
	String name;
    double gpa;
    String city;
    String course;
    
    public  Student(int id,String name,double gpa,String city,String course)
    {
    	this.id=id;
    	this.name=name;
    	this.gpa=gpa;
    	this.city=city;
    	this.course=course;
    	
    	
    }
    	@Override
    	public String toString()
    	{
    		return "\tID:" + id +
    				"\tName: " + name +
    				"\tGPA: " + gpa +
    				"\tCity: " + city +
    				"\tCourse: " + course + "\n";
    	}
    			
    

}
