package JavaBasics;

import java.util.Scanner;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class NonRepeatedCharinString {
	
	
	   public static char findFirstNonRepeatedChar(String str) {
	        int length = str.length();

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

	            // If the character is not repeated, return it
	            if (!isRepeated) {
	                return currentChar;
	            }
	        }

	        // If no non-repeated character is found
	        throw new RuntimeException("No non-repeated character found in the string.");
	    }

	    public static void main(String[] args) {
	        String str = "swiss";
	        try {
	            char result = findFirstNonRepeatedChar(str);
	            System.out.println("The first non-repeated character is: " + result);
	        } catch (RuntimeException e) {
	            System.out.println(e.getMessage());
	        }
	    }}