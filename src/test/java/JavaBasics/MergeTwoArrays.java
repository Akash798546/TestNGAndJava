package JavaBasics;

import java.util.Arrays;

public class MergeTwoArrays {
	
	public static void main(String[] args)
	{
		
		int[] a1= {2,4,6,5,3,8};
		int[] a2= {1,3,4,9,12,15};
		int[] a3= {};
		int len=Math.max(a1.length-1, a2.length);
		for(int i=0;i<a1.length-1;i++)
		{
			for(int j=i+1;j<a1.length-1;j++)
			{
				if(a1[i]!=a2[j])
				{
					a3[i]=a1[i];
				}
				
				
			}
			
			
		}
		
		
		System.out.println(Arrays.toString(a3));
		
	}

}
