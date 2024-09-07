package JavaBasics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySorting {

	public static void main(String[] args)
	{
		
		Integer sal[]= {20,40,5,15,30,18};
	
		System.out.println(Arrays.toString(sal));
		
		//****************By using arrays sort method**************************
		
		Arrays.sort(sal);
		
		System.out.println("The sorted aray is : "+Arrays.toString(sal));
		
		Arrays.sort(sal,Collections.reverseOrder());
		
		System.out.println("decending order sorted array : "+Arrays.toString(sal));
		
		
		// ****************By using Bubble sort*****************
		
		for(int i=0;i<sal.length;i++)
		{
			for(int j=0;j<sal.length-1-i;j++)
			{
			if(sal[j]<sal[j+1])
			{
				int temp=sal[j];
				sal[j]=sal[j+1];
				sal[j+1]=temp;
				
			}
			
		}
		
		
			}
		
		System.out.println("Sorted by bubble sort : "+Arrays.toString(sal));
		
		
	}
}
