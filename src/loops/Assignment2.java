package loops;

public class Assignment2 {
    // Print even and odd numbers between 200 to 500
    public static void main(String[] args) {
        int j = 200;
        while (j <= 500) {
            if (j % 2 == 0) {
                System.out.println(j + " " + "Is a even number");
            } else {
                System.out.println(j + " " + " Is a odd number");
            }
            j++;
        }
    }
}
// Is it must to use if loop in this example
// Is there any better way to code this
// Should j++ be outside braces