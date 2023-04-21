package loops;

public class Assignment6 {
    // Print the odd numbers from 200 to 25 in reverse order
    public static void main(String[] args) {
        int i = 200;
        while (i >= 25) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i--;
        }
    }
}
