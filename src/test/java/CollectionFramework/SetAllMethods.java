package CollectionFramework;


	
	
	
	import java.util.HashSet;
	import java.util.Set;

	public class SetAllMethods {
	    public static void main(String[] args) {
	        // Creating a Set
	        Set<String> set = new HashSet<>();

	        // Add Elements
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        System.out.println("Set after adding elements: " + set);

	        // Remove Element
	        set.remove("Banana");
	        System.out.println("Set after removing 'Banana': " + set);

	        // Size
	        System.out.println("Size of the set: " + set.size());

	        // Check Containment
	        System.out.println("Set contains 'Apple': " + set.contains("Apple"));
	        System.out.println("Set contains 'Banana': " + set.contains("Banana"));

	        // Clear All Elements
	        set.clear();
	        System.out.println("Set after clearing all elements: " + set);

	        // Re-add elements for further demonstration
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");

	        // Iterator
	        System.out.println("Iterating over the set:");
	        for (String fruit : set) {
	            System.out.println(fruit);
	        }

	        // Contains All
	        Set<String> anotherSet = new HashSet<>();
	        anotherSet.add("Apple");
	        anotherSet.add("Cherry");
//	        anotherSet.add("Mango");
	        
	        System.out.println("Set contains all elements of anotherSet: " + set.containsAll(anotherSet));

	        // Remove All
	        set.removeAll(anotherSet);
	        System.out.println("Set after removing elements of anotherSet: " + set);

	        // Retain All
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        set.retainAll(anotherSet);
	        System.out.println("Set after retaining elements of anotherSet: " + set);
	    }
	}


