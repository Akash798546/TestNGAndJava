package JavaBasics;

import java.util.Arrays;
import java.util.HashSet;

public class PracticeClass {
	
	
	
	public static void main(String[] args) {
		
		int[] ar={2,8,3,61,4,9};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					
				}
			}
			
		}
	System.out.println(Arrays.toString(ar));
	}
	

}



