package JavaBasics;

import java.util.Scanner;

public class StringPermutations {
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		permute(s,"");
	}
public static void permute(String str,String pre)
{
	int len=str.length();
	if(str.length()==0)
	{
		System.out.println(pre);
	}
	for(int i=0;i<len;i++)
	{
		
		String rev=str.substring(0,i)+str.substring(i+1);
		permute(rev,pre+str.charAt(i));
	}
		
	
	
	
	
}
	
}
