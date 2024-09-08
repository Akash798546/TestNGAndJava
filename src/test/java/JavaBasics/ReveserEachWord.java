package JavaBasics;

public class ReveserEachWord {
	
	public static void main(String[] args)
	{
	String s="java is a proramming launguage";
	String[] str=s.split("\\s+");
	String reverseString="";
	for(int i=str.length-1;i>=0;i--)
	{
		char rev;
		String st=str[i];
		String s1="";
		for(int j=0;j<st.length();j++)
		{
			 rev=st.charAt(j);
			s1=rev+s1;
		}
		reverseString =reverseString+s1+" ";
		
	}
	System.out.println(reverseString);
	}

}
