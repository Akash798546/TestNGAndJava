package JavaBasics;

import org.checkerframework.checker.index.qual.SubstringIndexBottom;
import org.checkerframework.checker.index.qual.SubstringIndexUnknown;

public class SwappingJavaStringWithTempVar {
	

	
	
	
public static void main(String[] args)
{

	
	String a="Akash";
	String b="Gupta";
	a=a+b;
	b=a.substring(0, a.length()-b.length());
	a=a.substring(b.length());
	System.out.println("a :"+a);
	System.out.println("b :"+b);
	
}
	
	

}
