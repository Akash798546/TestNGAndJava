package JavaBasics;

import java.util.Scanner;

public class GCPandLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num :");
		int num1 = sc.nextInt();
		System.out.println("Enter the second num :");
		int num2 = sc.nextInt();
		
		int orgNum1=num1;
		int orgNum2=num2;

		while(num2!=0)
		{
			int result=num1%num2;
			num1=num2;
			num2=result;
		}
		int gcd=num1;
		System.out.println("GCD :"+gcd);
		
		int lcm=(orgNum1*orgNum2)/gcd;
		System.out.println("LCM :"+lcm);
	}

}
