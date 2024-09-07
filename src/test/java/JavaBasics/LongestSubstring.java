package JavaBasics;

import java.util.HashSet;

public class LongestSubstring {
	
	public static void main(String[] args)
	{
		String str="sweweresd";
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
		
		
		
		int longestLength = 0;
        int left = 0;
        
        // Variables to store the start index and the longest substring
        String longestSubstring = "";
        
        // HashSet to store unique characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);
            
            // If the character is already in the set, remove characters from the left until it's not
            while (set.contains(c)) {
                set.remove(str.charAt(left));
                left++;
            }
            
            // Add the character to the set
            set.add(c);
            
            // Check if the current substring is the longest so far
            if (right - left + 1 > longestLength) {
                longestLength = right - left + 1;
                longestSubstring = str.substring(left, right + 1);  // Extract the current longest substring
            }
       
	}
    	System.out.println("Longest len: "+longestLength);
		System.out.println("substring is :"+longestSubstring);

}
}