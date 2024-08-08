package JavaBasics;

public class MissingNumberArray {
	
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,7};
		int sum=0;
		int sum1=0;
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of element in array :" +sum);
		
		for(int i=1;i<=7;i++)
		{
			sum1=sum1+i;
		}
		
		System.out.println("Sum of range of element in array :"+sum1);
		System.out.println("Missing Number is :"+ (sum1-sum));
	}

}
