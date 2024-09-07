package JavaBasics;

import java.util.Scanner;

public class PracticeTest {
	
	public static void main(String[] args)
	{
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter The String : ");
//		String str=sc.nextLine();
//		
//		String rev="";
//		for(int i=str.length()-1;i>=0 ;i--)
//		{
//			rev=rev+str.charAt(i);
//			
//			
//		}
//		System.out.println("The Reverse String Is :"+rev);
//		
//		StringBuffer sb=new StringBuffer(str);
//		StringBuffer st=sb.reverse();
//		String name=st.toString();
//		System.out.println("Reverse by string buffer "+name);
//		
//		String str="   My name is akash   ";
//		System.out.println(str);
//		String trm=str.trim();
//		System.out.println(trm);
//		String rem=str.replaceAll("\\s+", "");
//		System.out.println(rem);
		
		
		int[] a= {2,4,3,33,22,455,5444,21,2333,34,55};
		int l=a.length;
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		for(int i=0;i<l;i++)
		{
			if(max<a[i]) {
				secMax=max;
				max=a[i];
			}
			else if(a[i]<max && a[i]>secMax)
					{
						secMax=a[i];
						
					}
			
		}
		for(int j=0;j<l;j++)
		{
			if(a[j]<min) {
				secMin=min;
				min=a[j];
			}
			else if(a[j] > min  && a[j] < secMin)
					{
						secMin=a[j];
				
			}
		}

		
		System.out.println("Second Maxium : "+secMax);
		System.out.println("Second Minimum : "+secMin);
	}

}
