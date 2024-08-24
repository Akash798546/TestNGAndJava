package JavaBasics;

public class Diamond {

	public static void main(String[] args)
	{
		
		for(int i=1;i<=10;i++)
		{ 
			for(int m=11;m>i;m--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int d=0;d<i;d++)
			{
				if(d!=0)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int p=0;p<=10;p++)
		{ 
			for(int m1=1;m1<=p;m1++)
			{
				System.out.print(" ");
			}
			for(int n=10;n>=p;n--)
			{
				System.out.print("*");
			}
			for(int d1=10;d1>p;d1--)
			{
				
					System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
