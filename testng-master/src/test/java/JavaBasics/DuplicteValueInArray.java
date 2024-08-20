package JavaBasics;

public class DuplicteValueInArray {
	
	public static void main(String[] args)
	{
		String arry[]= {"java","C++","C","C++","java"};
		for (int i = 0; i < arry.length; i++) {
			for (int j = i+1; j < arry.length; j++) {
				if(arry[i]==arry[j])
				{
					System.out.print(" " +arry[j]);
					
				}
				
				
			}
			
		}
				
		
	}

}
