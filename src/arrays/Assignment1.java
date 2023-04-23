package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        // Taking input and printing output for single dimensional array
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter the arrays size: ");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Please enter array values: ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
