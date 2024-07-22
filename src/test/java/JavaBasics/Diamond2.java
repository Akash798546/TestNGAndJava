package JavaBasics;

public class Diamond2 {
	public static void main(String[] args)
	{
	
	for(int i=0;i<=8;i++)
	{
		for(int j=9;j>i;j--)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.print("*");
		}
		for(int l=1;l<=i;l++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int m=1;m<=8;m++)
	{
		for(int n=0;n<=m;n++)
		{
			System.out.print(" ");
		}
		for(int p=8;p>=m;p--)
		{
			System.out.print("*");
		}
		for(int q=8;q>m;q--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	}
}
