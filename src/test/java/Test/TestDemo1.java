package Test;

public class TestDemo1 {
	
	public static void main(String[] args)
	{
		
		String str="AKASH GUPTA";
		String[] s1=str.split("\\s");
				
		String rev="";
		
		for(String s:s1)
		{
			for(int j=s.length()-1;j>=0;j--)
			{
				
				rev=rev+s.charAt(j);
			}
			
		rev=rev+" ";
		}
		System.out.println(rev);
		
		
	}
	

}
