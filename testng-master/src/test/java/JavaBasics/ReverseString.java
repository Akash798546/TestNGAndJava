package JavaBasics;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String name="Akash";
		
		for (int i = name.length()-1; i>=0  ; i--) {
			System.out.print(name.charAt(i));
		}
		
		System.out.println();
		
		StringBuffer sb=new StringBuffer(name);
		StringBuffer  rev=sb.reverse();
		System.out.println(rev.toString());
	}

}
