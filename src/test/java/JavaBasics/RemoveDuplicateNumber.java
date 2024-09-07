package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateNumber {
    
   
	public static void main(String[] args) {
        
        // Original array
        int[] a = {2, 4, 5, 4, 6, 7, 3, 2};
        
        // Convert the primitive int array to an Integer ArrayList
        // Note: Arrays.asList() does not work directly with primitive int arrays
        // You need to first convert int array to Integer array
        Integer[] integerArray = Arrays.stream(a).boxed().toArray(Integer[]::new);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
        
        // Remove all occurrences of the number 2
//        list.removeAll(Arrays.asList(2));
      
        
        // Convert ArrayList back to an Integer array
        Integer[] arry = list.toArray(new Integer[0]);
        
        // Print the result
        System.out.println(Arrays.toString(arry));
    }
}
