package JavaBasics;

import java.util.Scanner;

public class Fibonacci_series {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first num : ");
		int FirstNum=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the second num : ");
		int secondnum=sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter the range : ");
		int range=sc2.nextInt();
		int sum=0;
		System.out.print(FirstNum+" "+secondnum);
		for (int i = 0; i < range; i++) {
			
			sum=FirstNum+secondnum;
			System.out.print(" "+sum);
			FirstNum=secondnum;
			secondnum=sum;
			
			
		}
		
		
	}

}
