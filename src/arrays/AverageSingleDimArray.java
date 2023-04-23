package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageSingleDimArray {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = e.nextInt();

        int[] arr = new int[size]; // Is this a constructor?

        System.out.println("Enter the array elemnets: "); // If it is in for loop it executes the same data for given
                                                          // number of arrays
        for (int i = 0; i < size; i++) {
            int num = e.nextInt();
            arr[i] = num;
        }

        System.out.println("Input: " + Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Output: " + sum / arr.length);
        e.close();

    }
}
