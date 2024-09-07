package Recursions;

public class Recursion01 {

	public static void printNum(int n)
	{
		if(n==0)
		{
			return ;
		}
		System.out.println(n);
		printNum(n-1);
		
	}
	public static void printIncreasenum(int p)
	{
		if(p==6)
		{
			return;
		}
		System.out.println(p);
		printIncreasenum(p+1);
		
	}
	
	
	public static void main(String[] args)
	{
		
		int n=5;
		int p=1;
		printNum(n);
		System.out.println("**************************************************");
	printIncreasenum(p);
		
		
		
	}
}
