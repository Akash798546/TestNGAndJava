package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	List<Student> al=new ArrayList();
	al.add(new Student(101,"Akash",8.9,"kanpur","Computer Science"));	
	al.add(new Student(102,"Piyush",8.5,"Lucknow","Electronics"));
	al.add(new Student(103,"Aryan",9.9,"Noida","BCA"));
	al.add(new Student(104,"Krishna",6.9,"Delhi","Computer Science"));
	al.add(new Student(105,"Harsh",7.9,"kanpur","B.com"));
	
	System.out.println(al);
}
}