package JavaBasics;

import java.util.Scanner;

public class ArmstrongNumber {
	
	
	public static void main(String[] args)
	{
		
//		Some ArmaStrong numbetrs are - 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number : ");
		int num=sc.nextInt();
		int temp=num;
		int a;
		int c=0;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		if(c==temp)
		{
			System.out.println("The number is armstrong");
		}
		else
		{
			System.out.println("The number is not armstrong");
		}
		
		
		
		
		
		
		
		
	}

}
