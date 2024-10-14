package JavaBasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set; 

public class RemoveDuplicateFromArray {
	
	
	public static void main(String[] args)
	{
		
		int[] a= {1,2,3,3,5,6,2};
		
		Set<Integer> st=new HashSet<>();
		for(int num:a)
		{
			st.add(num);		
		}
		a=st.stream().mapToInt(Integer::intValue).toArray();
		for(int value:a)
		{
			System.out.print(" "+value);
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
