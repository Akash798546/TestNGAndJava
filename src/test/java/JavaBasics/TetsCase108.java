package JavaBasics;

public class TetsCase108 {
	
	public static void main(String[] args)
	{
		
		String str="Akashgupta&&7985464273@akash1995qa@gmail.com";
		
		
		String vowels="AEIOUaeiou";
		int constacount=0;
		int vowelcount=0;
		int sum=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(vowels.indexOf(ch)!=-1)
			{
				vowelcount++;
			}
			if(Character.isLetter(ch))
			{
				constacount++;
			}
			if(Character.isDigit(ch)) {
				sum=sum+Character.getNumericValue(ch);
			}
			
			
		}
		System.out.println("vowels :"+vowelcount);
		System.out.println("consonant :"+constacount);
		System.out.println("sum of number is :"+sum);
		
		
	}

}
