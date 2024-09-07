package JavaBasics;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {

		Integer a[] = { 1, 2, 3, 4, 5 };
		Integer b[] = { 1, 3, 3, 4, 5 };

		boolean status = Arrays.equals(a, b);

		if (status == true) {
			System.out.println("Both arrays are equal");
		} else {
			System.out.println("Both are not equal");
		}

		boolean st = true;
		if (a.length == b.length)
		{
			for (int i = 0; i < a.length; i++) 
			{
				if (a[i]==(b[i]))
				{
					st = true;
					

				}
				else
				{
					st=false;
					break;
				}

			}

		}
		else
		{
			st=false;
		}
		if(st==true)
		{
			System.out.println("The arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		

	}
}
