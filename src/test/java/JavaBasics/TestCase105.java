package JavaBasics;

public class TestCase105 {
	
	public static void main(String[] args)
	{
		
		String str="swiss";
		int length=str.length();
		 for (int i = 0; i < length; i++) {
	            char currentChar = str.charAt(i);
	            boolean isRepeated = false;

	            // Check if currentChar is repeated in the string
	            for (int j = 0; j < length; j++) {
	                if (i != j && currentChar == str.charAt(j)) {
	                    isRepeated = true;
	                    
	                    break;
	                }
	            }
	            if (isRepeated==false) {
	                System.out.println("First non-repeating character: " + currentChar);
	                return;
	            }
			
		}
		
		
		
	}

}
