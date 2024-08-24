package JavaBasics;

public class NumberOfVowelAndConsonantInString {
	
	
	
	public static void main(String[] args)
	{
		
		String name="akashgupta";
		int vowel=0;
		int cons=0;
		
		int size=name.length();
		for(int i=0;i<size;i++)
		{
			char ch=name.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
			{
			   vowel++;
			}
			else
			{
				cons++;
			}
		}
		System.out.println("Number of vowels are : "+vowel+" and Number of constant are : "+cons);
		 
		
		
	}

}
