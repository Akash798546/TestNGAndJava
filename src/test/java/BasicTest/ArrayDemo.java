package BasicTest;

import java.util.Iterator;

public class ArrayDemo {
	
	public static void main(String[] args)
	{
		int array1[]=new int[10];
		int newarray[]= {5,6,2,3,4,1,7,8,9};
		int sum=0;
		array1[0]=11;
		array1[1]=12;
		array1[2]=13;
		array1[3]=14;
		array1[4]=15;
		array1[5]=16;
		array1[6]=17;
		array1[7]=18;
		array1[8]=19;
		array1[9]=20;
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		int min=newarray[0];
		for (int i = 0; i < newarray.length; i++) {
			if(min>newarray[i])
			{
				min=newarray[i];
			}
		}
		System.out.println("Minimun number is : "+min);
		
		
		for (int i = 0; i < newarray.length; i++) {
			System.out.println(newarray[i]);
		}
		
		for (int i = 0; i < newarray.length; i++) {
			sum=sum+newarray[i];
		
		}
		System.out.println("The Sum of array is : "+sum);
	}
	
	

}
