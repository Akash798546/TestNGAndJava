package JavaBasics;

public class Test01 {
	
	public static void main(String[] args)
	{
		
		int[] a= {2,3,6,44,54,11,60,33,65,67};
		int max=Integer.MIN_VALUE;
		int  Secondlargest = Integer.MIN_VALUE;
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			if(max<a[i])
			{
				Secondlargest=max;
				max=a[i];
				
			}
			else if(a[i]<Secondlargest && a[i]!=max)
			{
				Secondlargest=a[i];
			}
			
		}
		System.out.println(Secondlargest);
		
		
		
	}
			

}
