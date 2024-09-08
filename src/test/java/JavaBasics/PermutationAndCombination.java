package JavaBasics;

public class PermutationAndCombination {
	
	
	public static void main(String[] args)
	{
		String s="abc";
		permute(s, "");
		
	}

	public static void permute(String str,String prefix)
	{
		
		if(str.length()==0)
		{
			System.out.println(prefix);
		}
		for(int i=0;i<str.length();i++)
		{//
		String rev=str.substring(0,i)+str.substring(i+1);
		permute(rev,prefix+str.charAt(i));
		
		}
		
	}
}
 