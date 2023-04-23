package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = d.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the array elements:  " + (i + 1) + " :  ");
            int num = d.nextInt();
            arr[i] = num;
        }

        System.out.println("Input: " + Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Output: " + sum);
        d.close(); // It's a practice to avoid from potential data leakage
    }
}
// Can it be used as a potential for summing a mutliple data input
// Real life scenario difference between multi and single dim array