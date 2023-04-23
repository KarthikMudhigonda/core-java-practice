package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputSingleDimArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Why is it showing me warning sign for input

        // Get the size of the array from user input
        System.out.print("Enter the arrays size:  ");
        int size = input.nextInt();

        // Create an array of integers with the given size
        // Also replaces usage of arr.length
        int[] arr = new int[size];

        // Get values for the array from user input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: " + (i + 1) + " :  ");
            int num = input.nextInt();
            arr[i] = num;
        }

        // Loop through the array and print its elements
        System.out.println("Elements of array: ");
        // for (int i = 0; i < size; i++) { for multidimension array comeback to this,
        // look why is it printing the same elements but multiple times
        System.out.println(Arrays.toString(arr));
    }
}
