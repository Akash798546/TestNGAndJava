package CollectionFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAllMethodsExample {
    public static void main(String[] args) {
        // Creating a List
        List<String> list = new ArrayList<>();

        // Add Elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List after adding elements: " + list);

        // Add Element at Specific Index
        list.add(1, "Blueberry");
        System.out.println("List after adding 'Blueberry' at index 1: " + list);

        // Remove Element by Object
        list.remove("Banana");
        System.out.println("List after removing 'Banana': " + list);

        // Remove Element by Index
        list.remove(2); // Removes 'Cherry' (at index 2 after previous operations)
        System.out.println("List after removing element at index 2: " + list);

        // Size
        System.out.println("Size of the list: " + list.size());

        // Check Containment
        System.out.println("List contains 'Apple': " + list.contains("Apple"));
        System.out.println("List contains 'Banana': " + list.contains("Banana"));

        // Access by Index
        System.out.println("Element at index 0: " + list.get(0));

        // Set Element
        list.set(0, "Avocado");
        System.out.println("List after setting element at index 0 to 'Avocado': " + list);

        // Index of Element
        System.out.println("Index of 'Avocado': " + list.indexOf("Avocado"));
        System.out.println("Index of 'Blueberry': " + list.indexOf("Blueberry"));

        // Last Index of Element
        list.add("Avocado"); // Adding another 'Avocado'
        System.out.println("Last index of 'Avocado': " + list.lastIndexOf("Avocado"));

        // Sublist
        List<String> sublist = list.subList(1, 3);
        System.out.println("Sublist from index 1 to 3: " + sublist);

        // Sort (Requires Comparable or Comparator)
        list.sort(null); // Sorts the list in natural order
        System.out.println("List after sorting: " + list);
        
        // Contains All
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Avocado");
        anotherList.add("Blueberry");
        System.out.println("List contains all elements of anotherList: " + list.containsAll(anotherList));

        // Remove All
        list.removeAll(anotherList);
        System.out.println("List after removing all elements of anotherList: " + list);

        // Retain All
        list.add("Apple");
        list.add("Banana");
        list.retainAll(anotherList);
        System.out.println("List after retaining only elements of anotherList: " + list);
    }
}
