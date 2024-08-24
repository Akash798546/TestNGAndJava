package JavaBasics;

public class LargestNumberInArray {
	
	public static void main(String[] args)
	{
		int a[]= {20,50,60,15,25};
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
			
		}
		System.out.println("The largest number is :"+max);
	}

}
