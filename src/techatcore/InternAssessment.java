package techatcore;

import java.util.ArrayList;
import java.util.List;

public class InternAssessment {
    public static void main(String[] args) {
        // Create an array of input strings
        String[] inputStrings = { "KARTHIK", "AVA", "HAPPY", "REFER", "CIVIC", "HANNAH" };

        // Create two ArrayLists to store palindrome and non-palindrome strings
        List<String> palindromeStrings = new ArrayList<>();
        List<String> nonPalindromeStrings = new ArrayList<>();

        for (String s : inputStrings) {
            // Using if checking is string a palidrome
            if (isPalindrome(s)) {
                // If yes, adding it to palindrome list
                palindromeStrings.add(s);
            } else {
                // If it's not, adding it to non palindrome list
                nonPalindromeStrings.add(s);
            }
        }

        // Print the number of palindrome strings and their values
        System.out.println("Count of Palindrome Strings: " + palindromeStrings.size());
        for (String s : palindromeStrings) {
            System.out.println("Palindrome string: " + s);
        }
        // Print the number of non-palindrome strings and their values
        System.out.println("Count of Non-Palindrome Strings: " + nonPalindromeStrings.size());
        for (String s : nonPalindromeStrings) {
            System.out.println("Non-Palindrome string: " + s);
        }
    }

    // function to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                // If the characters at i and j are not equal, the string is not a palindrome
                return false;
            }
            i++;
            j--;
        }
        // If we've reached this point, the string is a palindrome
        return true;
    }
}
