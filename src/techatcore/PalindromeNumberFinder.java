package techatcore;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumberFinder {
    public static void main(String[] args) {
        // Create an array of input integers
        int[] inputIntegers = { 1111, 2222, 2234, 6646, 7427, 2828, 5665 };

        // Create two ArrayLists to store palindrome and non-palindrome integers
        List<Integer> palindromeIntegers = new ArrayList<>();
        List<Integer> nonPalindromeIntegers = new ArrayList<>();

        for (int inputInteger : inputIntegers) {
            // Using if to check if integer is a palindrome
            if (isPalindrome(inputInteger)) {
                // If yes, adding it to palindrome list
                palindromeIntegers.add(inputInteger);
            } else {
                // If it's not, adding it to non palindrome list
                nonPalindromeIntegers.add(inputInteger);
            }
        }

        // Print the number of palindrome integers and their values
        System.out.println("Count of Palindrome Integers: " + palindromeIntegers.size());
        for (int palindrome : palindromeIntegers) {
            System.out.println("Palindrome integer: " + palindrome);
        }

        // Print the number of non-palindrome integers and their values
        System.out.println("Count of Non - Palindrome Integers: " + nonPalindromeIntegers.size());
        for (int nonPalindrome : nonPalindromeIntegers) {
            System.out.println("Non - Palindrome integer: " + nonPalindrome);
        }
    }

    // Function to check if an integer is a palindrome
    public static boolean isPalindrome(int inputInteger) {
        int originalNumber = inputInteger;
        int reversedNumber = 0;
        for (int digit : String.valueOf(inputInteger).toCharArray()) {
            reversedNumber = reversedNumber * 10 + (digit - '0');
        }
        // If the given input integer is a palindrome
        if (originalNumber == reversedNumber) {
            return true;
        } else { // If it is a non palindrome
            return false;
        }
    }

}
