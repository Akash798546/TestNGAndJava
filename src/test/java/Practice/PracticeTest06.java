package Practice;

public class PracticeTest06 {

	public static void main(String[] args)
	{
		String name="akash gupta";
		String[] st=name.split("\\s");
		for(int i=st.length-1;i>=0;i--)
		{
			String s=st[i];
		   char[] ch=s.toCharArray();
		   for(int j=ch.length-1;j>=0;j--)
		   {
			   System.out.print(ch[j]);
			   
		   }
			System.out.print(" ");
			
		}
	}
}
