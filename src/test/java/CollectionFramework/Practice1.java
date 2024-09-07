package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Practice1 {
    
    public static void main(String[] args) {

        // Create and populate a HashSet
        Set<String> set = new HashSet<>();
        set.add("Aryan");
        set.add("Tom");
        set.add("Krish"); 
        set.add("Rahul"); 
        set.add("Peter");
        
        // Print the HashSet (order is not guaranteed)
        System.out.println("HashSet contents: " + set);
        
        // Remove an element from the HashSet
        set.remove("Rahul");
        System.out.println("HashSet after removal: " + set);
        
        // Check if the element is present in the HashSet
        if (!set.contains("Rahul")) {
            System.out.println("Rahul is not present");
        } else {
            System.out.println("Rahul is present");
        }
        
        // Convert HashSet to LinkedHashSet to maintain insertion order
        Set<String> set1 = new LinkedHashSet<>(set);
        System.out.println("The insertion order is:");
        for (String name : set1) {
            System.out.println(name);
        }
        
        //Converting HashSet to TreeSet to maintain insertion order
       Set<String> sortSet=new TreeSet<>(set);
       System.out.println("The Sorted LIst is:");
       for(String name:sortSet)
       {
    	   System.out.println(name);
       }
    }
}
