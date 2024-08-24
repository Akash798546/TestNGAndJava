package JavaBasics;

import java.util.Scanner;

public class PrintInitials {

	 public static void main(String[] args) {
	        // Create a Scanner object for input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user for first name, middle name, and surname
	        System.out.print("Enter your first name: ");
	        String firstName = scanner.nextLine().trim();
	        
	        System.out.print("Enter your middle name: ");
	        String middleName = scanner.nextLine().trim();
	        
	        System.out.print("Enter your surname: ");
	        String surname = scanner.nextLine().trim();
	        
	        // Close the scanner
	        scanner.close();
	        
	        // Print the initials
	        printInitials(firstName, middleName, surname);
	    }

	    public static void printInitials(String firstName, String middleName, String surname) {
	        // Get the first letter of each name and convert to uppercase
	        char firstInitial = Character.toUpperCase(firstName.charAt(0));
	        char middleInitial = Character.toUpperCase(middleName.charAt(0));
	        char surnameInitial = Character.toUpperCase(surname.charAt(0));
	        
	        // Print the initials
	        System.out.println("Initials: " + firstInitial + "." + middleInitial + "." + surnameInitial + ".");
	    }
}
