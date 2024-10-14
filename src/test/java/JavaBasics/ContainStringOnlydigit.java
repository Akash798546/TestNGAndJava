package JavaBasics;

public class ContainStringOnlydigit {

	public static void main(String[] args)
	{
		
		
		String str="8879790809";
		boolean result=false;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!Character.isDigit(ch))
			{
				result=true;
			}
		
		}
		if(result==false)
		{
			
			System.out.println("The String is having only digit");
			
		}
		else
		{
			System.out.println("The String is not having only digit");
		}
		
	}
}
