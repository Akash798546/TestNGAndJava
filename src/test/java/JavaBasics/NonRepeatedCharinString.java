package JavaBasics;

import java.util.HashMap;
import java.util.Scanner;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class NonRepeatedCharinString {
	public static void main(String[] args) {
			String str = "skwisses";
//			boolean flag=false;
//			for(int i=0;i<str.length();i++) {
//				char ch=str.charAt(i);
//				flag=false;
//				for(int j=0;j<str.length();j++)
//				{
//					if(i!=j && ch==str.charAt(j))
//					{
//						flag=true;
//						break;
//					}	
//				}
//				if(!flag)
//				{
//					System.out.println("The first no repeative char is :"+ch);
//					return;
//				}
//			
//			
//				
//				
//			}
//			
			
			
			HashMap<Character,Integer> map=new HashMap();
			
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				map.put(ch, map.getOrDefault(ch, 0)+1);
				
			}
			
			 for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            if (map.get(ch) == 1) {
		                System.out.println("First non-repeated character: " + ch);
		                break;  // Exit after finding the first non-repeated character
		            }
		        }
			
			
			
//			
			
		}
		
		
		
		
		
	}
	
	      
