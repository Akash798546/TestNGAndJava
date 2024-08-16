package JavaBasics;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class AnagramString {
	
	public static void main(String[] args)
	{
	String s1="listen";
	String s2="silent";
	
	char[] ch1=s1.toCharArray();
	char[] ch2=s2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	boolean status=Arrays.equals(ch1, ch2);
	
	if(status==true)
	{
		System.out.println("The String is Anagram");
		
	}
	else
	{
		System.out.println("The string is not anagram");
	}
	
			
	}
	

}
