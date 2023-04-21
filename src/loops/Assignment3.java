package loops;

public class Assignment3 {
    // Printing numbers divisible by 9 in between 1 to 99
    public static void main(String[] args) {
        int a = 1;
        while (a <= 99) {
            if (a % 9 == 0) {
                System.out.println(a + " " + " is divisible by 9");
            }
            a++;
        }
    }
}
