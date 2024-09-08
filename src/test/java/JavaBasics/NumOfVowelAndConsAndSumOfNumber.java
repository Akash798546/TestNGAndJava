package JavaBasics;

public class NumOfVowelAndConsAndSumOfNumber {

	public static void main(String[] args)
	{
	
		String str="Akashgupta&&7985464273@@!akash1995qa@gmail.com";
		//number of vowels
		//number of consonant
		//sum of given number
		//number of special char
		String vowels="AEIOUaeiou";
		int vow=0;
		int cons=0;
		int specs=0;
		int sum=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(vowels.indexOf(ch)!=-1)
			{
				vow++;
			}
			
			if(Character.isLetter(ch))
			{
				cons++;
			}
			
			if(Character.isDigit(ch))
			{
				sum=sum+Character.getNumericValue(ch);
			}
			if(!Character.isLetterOrDigit(ch))
			{
				specs++;
			}
			
		}
		
		System.out.println("Number of vowel :"+vow);
		System.out.println("Number of consonant :"+cons);
		System.out.println("sum of numberrs :"+sum);
		System.out.println("number of Special character :"+specs);
		}
}
