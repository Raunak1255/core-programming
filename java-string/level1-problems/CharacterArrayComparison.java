import java.util.*;

public class CharacterArrayComparison {

    // Method to convert a string into a character array without using toCharArray()
    public static char[] convertStringToCharArray(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    // Now create a method to compare two character arrays
    public static boolean areArraysEqual(char[] array1, char[] array2) {
        // Here i compare the lengths. if different it means the arrays are not equal
        if (array1.length != array2.length) {
            return false;
        }

        // Compare each character in both arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Return false if any character is different
            }
        }

        // If all characters match
        return true;
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert string to character arrays using both methods
        char[] userDefinedArray = convertStringToCharArray(inputString);
        char[] builtInArray = inputString.toCharArray();

        // Compare both arrays
        boolean arraysAreEqual = areArraysEqual(userDefinedArray, builtInArray);

        // Display the results
        System.out.println("Character array using user-defined method: " + Arrays.toString(userDefinedArray));
        System.out.println("Character array using built-in toCharArray() method: " + Arrays.toString(builtInArray));
        System.out.println("Are both character arrays equal? " + arraysAreEqual);


    }
}
