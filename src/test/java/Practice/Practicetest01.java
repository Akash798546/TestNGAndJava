package Practice;

import java.util.Arrays;

public class Practicetest01 {
	
	
	public static void main(String[] args)
	{
		
		int[] s= {8,2,5,7,2,9,1,3};
		int max=Integer.MAX_VALUE;
		for(int i=0;i<s.length;i++)
		{
			if(max>s[i])
			{
				max=s[i];
				
			}
			
		}
		System.out.println(max);
		
		
	}

}
