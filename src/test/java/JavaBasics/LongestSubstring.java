package JavaBasics;

import java.util.HashSet;

public class LongestSubstring {
	
	public static void main(String[] args)
	{
		String str="swewejresd";
//		HashMap<Character,Integer> map=new HashMap();
//		char[] arr=str.toCharArray();
//		String sub=null;
//		int len=0;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			char ch=arr[i];
//			if(!map.containsKey(ch))
//			{
//				map.put(ch, i);
//			}
//			else
//			{
//				i= map.get(ch);
//				map.clear();
//			}
//		}
//		if(map.size()>len)
//		{
//			len=map.size();
//			sub=map.keySet().toString();
//		}
//		System.out.println("length of substring :"+len );
//		System.out.println("substring :"+sub );
//		
		
		

		int longestlen = 0;
		String longestsub = "";
		HashSet set = new HashSet();
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			while(set.contains(ch)) {
				
				set.remove(str.charAt(j));
				j++;
			}
			set.add(ch);
			longestsub=str.substring(j,i+1);
//			if(i-j+1>longestlen)
//			{
////				longestlen=i-j+1;
//				
//			}
		}
System.out.println(longestsub);

}
}