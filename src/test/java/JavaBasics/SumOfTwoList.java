package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class SumOfTwoList
{

    public static List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> ls = new ArrayList<>();
        int carry = 0;
        	   int sum=0;
        int maxSize = Math.max(l1.size(), l2.size());
        
       for(int i=0;i<maxSize;i++)
       {
    	  int num1=(i<l1.size())?l1.get(i):0;
    	  int num2=(i<l2.size())?l2.get(i):0;
    	  
    	   sum=carry+num1+num2;
    	   carry=sum/10;
    	   int digit=sum%10;
    	   
    	   ls.add(digit);
    	   
       }
       if(carry>0)
       {
    	   ls.add(carry);
    	   
       }
	return ls;
    }
    public static void main(String[] args)
    {
    	
    	List<Integer> l1=new ArrayList();
    	List<Integer> l2=new ArrayList();
    	
    	l1.add(1);
    	l1.add(3);
    	l1.add(4);
    	l1.add(6);
    	l1.add(7);
    
    	l2.add(2);
    	l2.add(8);
    	l2.add(9);
    	l2.add(10);
    	l2.add(12);
    	System.out.println(l1);
    	System.out.println(l2);
    List ls=	addTwoNumbers(l1, l2);
    System.out.println(ls);
    	
    	
    }
    
    
}
