package JavaBasics;

public class LargestNumberInArray {
	
	public static void main(String[] args)
	{
		int a[]= {20,50,60,89,15,70,99,25,101};
		int max=a[0];
		int	SeconLargest = 0;
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				SeconLargest=max;
				max=a[i];	
				if(max>a[i] && a[i]>SeconLargest)
				{
					SeconLargest=a[i];
				}
		}
	}
		System.out.println("The largest number is :"+SeconLargest);
}}
