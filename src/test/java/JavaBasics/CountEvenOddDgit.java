package JavaBasics;

import java.util.Scanner;

public class CountEvenOddDgit {
	
	public static void main(String[] args)
	{
		int Odd_count=0;
		int Even_count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
      while(num>0)
      {
    	  int rem=num%10;
    	  if(rem%2==0)
    	  {
    		  Even_count++;
    	  }
    	  else
    	  {
    		  Odd_count++;
    	  }
    	  
    	  num=num/10;
      }
      
      System.out.println("Even number digit : "+Even_count);
      System.out.println("Odd number digit : "+Odd_count);
      
	}
	}
