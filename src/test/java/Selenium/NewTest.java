package Selenium;

public class NewTest {
	
	public static void main(String[] args)
	{
		String str="aabbccccdddaaabbcccc";
		char[] st=str.toCharArray();
		for(int i=0;i<st.length-1;i++)
		{
			
			if(st[i]!=st[i+1])
			{
				System.out.print(st[i]);
			}
			
			
		}
		System.out.print(st[st.length-1]);
		
		
		
		
	}

}
