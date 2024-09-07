package JavaBasics;



public class TestCase106 {

    public static void main(String[] args) {
        
        // Print all lowercase alphabets using ASCII values
        System.out.println("Lowercase alphabets:");
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");
        }
        
        System.out.println(); // For a new line
        
        // Print all uppercase alphabets using ASCII values
        System.out.println("Uppercase alphabets:");
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
    }
}
