package techatcore;

import java.util.ArrayList;
import java.util.List;

public class InternAssessment { // Change to PalindromeStringFinder
    public static void main(String[] args) {
        // Create an array of input strings
        //Decalred, initialised and instantiated all at once
        String[] inputStrings = { "KARTHIK", "AVA", "HAPPY", "REFER", "CIVIC", "HANNAH", };

        // Create two ArrayLists to store palindrome and non-palindrome strings
        List<String> palindromeStrings = new ArrayList<>();
        List<String> nonPalindromeStrings = new ArrayList<>();

        for (String inputString : inputStrings) { // for each loop
            // Using if checking is string a palidrome
            if (isPalindrome(inputString)) {
                // If yes, adding it to palindrome list
                palindromeStrings.add(inputString);
            } else {
                // If it's not, adding it to non palindrome list
                nonPalindromeStrings.add(inputString);
            }
        }

        // Print the number of palindrome strings and their values
        System.out.println("Count of Palindrome Strings: " + palindromeStrings.size());
        for (String palindrome : palindromeStrings) {
            System.out.println("Palindrome string: " + palindrome);
        }
        // Print the number of non-palindrome strings and their values
        System.out.println("Count of Non - Palindrome Strings: " + nonPalindromeStrings.size());
        for (String nonPalindrome : nonPalindromeStrings) {
            System.out.println("Non - Palindrome string: " + nonPalindrome);
        }
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String inputString) {
        String reverseString = "";
        int inputStringLength = inputString.length() - 1;
        for (int count = inputStringLength; count >= 0; --count) {
            reverseString += inputString.charAt(count);
        }
        // If the given input string is a palindrome
        if (inputString.equals(reverseString)) {
            return true;
        } else { // If it is a non palindrome
            return false;
        }
    }
}
