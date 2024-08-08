package JavaBasics;

public class SearchElementInArray {
	public static void main(String[] args)
	{
	
	int a[]= {10,20,30,60,59};
	boolean flag=false;
	int search_value=59;
	
	for (int i = 0; i < a.length; i++) {
		if(search_value==a[i])
			
		{
			System.out.println("The element found at :"+i);
			flag=true;
			break;
		}
		
	}
	if(flag==false)
	{
		System.out.println("Element not found");
	}
	
	}
}
