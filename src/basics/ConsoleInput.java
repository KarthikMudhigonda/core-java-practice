package basics;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner example = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = example.nextInt();
        System.out.printf("Your are %d years old \n", age);
        System.out.println("Thank you");
        example.close();

    }

}
