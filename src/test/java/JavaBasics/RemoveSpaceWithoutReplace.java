package JavaBasics;

import java.util.Scanner;

public class RemoveSpaceWithoutReplace {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		String st=doubleLetter(s);
		System.out.println(st);
		}
	
	public static String doubleLetter(String str)
	{
		StringBuffer letter=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isLetter(ch))
			{
				letter.append(ch);
			}
//			letter.append(ch).append(ch);
			
			
			
		}
		return letter.toString();
		
		
		
	}
	
}
