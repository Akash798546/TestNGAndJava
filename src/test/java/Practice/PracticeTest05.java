package Practice;

public class PracticeTest05 {
	
	public static void main(String[] args)
	{
		int[] a= {7,9,5,2,16,8,1,3,4};
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length-1;i++)
		{
			if(max<a[i])
			{
				secMax=max;
				max=a[i];
				
				
			}
			if(max>a[i] && a[i]>secMax)
			{
				secMax=a[i];
			}
		}
		System.out.println(secMax);
		
		
	}

}
