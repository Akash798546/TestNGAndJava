package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class TestCase108 {

    public List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> ls = new ArrayList<>();
        int carry = 0;
        
        int maxSize = Math.max(l1.size(), l2.size());
        
        // Loop through both lists
        for (int i = 0; i < maxSize; i++) {
            // Get the current digits, if the list is shorter, use 0
            int num1 = i < l1.size() ? l1.get(i) : 0;
            int num2 = i < l2.size() ? l2.get(i) : 0;
            
            // Add the two digits and the carry
            int sum = num1 + num2 + carry;
            
            // Calculate new carry and the digit to store
            carry = sum / 10;
            int digit = sum % 10;
            
            // Add the digit to the result list
            ls.add(digit);
        }
        
        // If there's any carry left after the loop, add it
        if (carry > 0) {
            ls.add(carry);
        }
        
        return ls;
    }

    public static void main(String[] args) {
        TestCase108 tc108 = new TestCase108();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        l1.add(2);
        l1.add(4);
        l1.add(3);
        
        l2.add(5);
        l2.add(6);
        l2.add(4);
        
        List<Integer> result = tc108.addTwoNumbers(l1, l2);
        System.out.println(result); // Output: [7, 0, 8]
    }
}
