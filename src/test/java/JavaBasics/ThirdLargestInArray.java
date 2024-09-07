package JavaBasics;

public class ThirdLargestInArray {
	
	public static void main(String[] args)
	{
	int[] a= {2,6,3,66,32,661,223,111,88};
	int max=Integer.MIN_VALUE;
	int secmax=Integer.MIN_VALUE;
	int tmax=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
		{
			secmax=max;
			max=a[i];
		}
		else if(a[i]<max && a[i]>secmax)
		{
			secmax=a[i];
		}
		else if(a[i]<max && a[i]<secmax && a[i]>tmax)
		{
			tmax=a[i];
		}
	}
	System.out.println(tmax);
	
	
	}
}
