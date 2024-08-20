package JavaBasics;

import java.util.Arrays;

public class RemoveduplicateStringFromArray {
	
	
	public static void main(String[] args)
	{
		String arry[]= {"java","C++","C","C++","java"};
		System.out.println("Before"+Arrays.toString(arry));
		
		 arry=Arrays.stream(arry).distinct().toArray(String[]::new);
		 System.out.println("After"+Arrays.toString(arry));
	}

}
