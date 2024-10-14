package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	public static void rotateLeft(int[] array,int n)
	{
		int length=array.length;
		n=n%length;
		int[] temp=new int[length];
		for(int i=0;i<length;i++)
		{
			
			 temp[i]=array[(i+n)%length];
			
		}
		System.arraycopy(temp, 0, array, 0, length);
		
	}
	public static void rotateRight(int[] arr,int n)
	{
		int length=arr.length;
		n=n%length;
		
		int[] temp=new int[length];
		for(int i=0;i<length;i++)
		{
			temp[(i+n)%length]=arr[i];
					
		}
		System.arraycopy(temp, 0, arr, 0, length);	
	}
	
	public static void main(String[] args) {
		
		int[] ar= {3,45,7,5,36,78,97,55};
		System.out.println(Arrays.toString(ar));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of position to rotate");
		int n=sc.nextInt();
		char direction=sc.next().charAt(0);
		if(direction=='l' || direction=='L')
		{
			rotateLeft(ar, n);
			
		}
		else if(direction=='r' || direction=='R')
		{
			rotateRight(ar, n);
			
		}
		else
		{
			System.out.println("invalid inputs");
		}
		   System.out.println("Rotated array: " +Arrays.toString(ar));
	
	}//[36, 78, 97, 55, 3, 45, 7, 5],[97, 55, 3, 45, 7, 5, 36, 78],[7, 5, 36, 78, 97, 55, 3, 45] 
	
}
