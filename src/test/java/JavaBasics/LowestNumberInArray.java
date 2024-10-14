package JavaBasics;

import java.util.Arrays;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class LowestNumberInArray {
	
	public static void main(String[] args)
	{
		
		int[] a= {8,4,5,3,6,2,1,9};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			
			if(min>a[i])
			{
				min=a[i];
			}
			
			
//			for(int j=0;j<a.length-1;j++)	
//			{
			
//				if(a[j]>a[j+1])
//				{
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//				
				
//			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(min);
//		System.out.println("The Second lowest number is : "+a[0]);
		
	}
	

}
