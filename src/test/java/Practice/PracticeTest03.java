package Practice;

import java.util.HashSet;

public class PracticeTest03 {

	public static void main(String[] args)
	{
		String str="abcbadera";
		String longsub="";
		int j=0;
		HashSet set=new HashSet();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			while(set.contains(ch))
			{
				set.remove(str.charAt(j));
				j++;
			}
			set.add(ch);
			longsub=str.substring(j,i+1);
		}
		System.out.println(longsub);
	}

}
