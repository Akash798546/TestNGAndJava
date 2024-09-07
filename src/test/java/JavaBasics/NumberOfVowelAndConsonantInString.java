package JavaBasics;

public class NumberOfVowelAndConsonantInString {
	
	
	
	public static void main(String[] args)
	{
		
		String name="akash gupta";
		int vowel=0;
		int cons=0;
		String rep=name.replaceAll("\\s+", "");
		int size=rep.length();
		for(int i=0;i<size;i++)
		{
			char ch=rep.charAt(i);
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
