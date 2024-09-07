package Recursions;
  
public class Recursion02 {

	public static void sumOfNum(int i,int sum,int n)
	{
		if(i==n)
		{sum +=n;
		System.out.println(sum);
			return;
		}
		 
		 sum=sum+i;
		 sumOfNum(i+1, sum, n);
		
	}
	
	
	public static void multiply(int num,int multi,int p)
	{
		if(p==num)
		{
			multi*=num;
			System.out.println(multi);
			return ;
		}
		
		multi*=p;
		multiply(num, multi, p+1);
		
		
	}
	
	public static void main(String[] args)
	{
		
		sumOfNum(1, 0, 5);
		multiply(5, 1, 1);
		
	}
	
}
