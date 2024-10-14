package JavaBasics;

import java.util.Arrays;

public class MergeTwoArrays {
	
	public static void main(String[] args)
	{
		
		int[] a1= {2,4,6,5,3,8};
		int[] a2= {1,3,4,9,12,15};
		
//		int len=Math.max(a1.length, a2.length);
		int[] a3= new int[a1.length+a2.length];
		int k=0;
		for(int i=0;i<a1.length;i++)
		{
				a3[k]=a1[i];
					k++;
		}
		for(int j=0;j<a2.length;j++)
		{
				a3[k]=a2[j];
					k++;
		}
		
		int[] UniqueArray=Arrays.stream(a3).distinct().toArray();
		System.out.println(Arrays.toString(UniqueArray));
		
	}

}
