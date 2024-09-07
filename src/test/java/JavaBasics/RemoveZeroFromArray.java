package JavaBasics;

import java.util.Arrays;

public class RemoveZeroFromArray {
	
	static int nonZeroIndex=0;
	public static void main(String[] args)
	{
		int[] a= {1,2,0,0,4,0,6,0,0,7,9,0,8};
		
//		for(int num:a) {
//			System.out.print(" "+num);
//		}
//		System.out.println(" ");
		int movezero=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[movezero];
				a[movezero]=temp;
				movezero++;
						
			}
		}
		System.out.println("Array after moving the zero at the end");
		for(int num:a) {
			System.out.print(" "+num);
		}
	System.out.println(Arrays.toString(a));
	}
	
}