package Practice;

public class Practicetest04 {
	
	public static void main(String[] args)
	{
		
		String str="Akashgupta09@@7985464273##akash995qa2gmail.com";
		int vow=0;
		int cons=0;
		int spex=0;
		String vowels="AEIOUaeiou";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(vowels.indexOf(ch)!=-1)
			{
				vow++;
				
			}
			
			if(Character.isLetter(ch)) {
				cons++;
			}
			if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(ch);
			}
			if(!Character.isLetterOrDigit(ch))
			{
				spex++;
			}
			
		}
		
		System.out.println("vowels are :"+vow);
		System.out.println("Consonants are :"+cons);
		System.out.println("Special Characters are :"+spex);
		System.out.println("Sum of all the number is :"+sum);
	}

}
