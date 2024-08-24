package JavaBasics;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String[] args)
	{
		Random rand=new Random();
		int random_num=rand.nextInt(100);
		System.out.println(random_num);
	}

}
