 package JavaBasics;

import java.util.Arrays;

public class RemoveduplicateStringFromArray {
	
	
	public static void main(String[] args)
	{
		String[] arry= {"java","C++","C","C++","java"};
		System.out.println("Before"+Arrays.toString(arry));
		int[] a= {1,2,2,3,5,6,4,3};
		
		 a=Arrays.stream(a).distinct().toArray();
		 arry=Arrays.stream(arry).distinct().toArray(String[]::new);
		
		 System.out.println("After"+Arrays.toString(arry));
		 System.out.println("After"+Arrays.toString(a));
	}

}
 