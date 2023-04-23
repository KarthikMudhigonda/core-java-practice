package loops;

public class Assignment5 {
    // Print sum of even number from 40 to 80
    public static void main(String[] args) {
        int i = 40;
        int j = 0;
        while (i <= 80) {
            j += i; // j = j+i
            i += 2; // i = i+2
        }
        System.out.println(j);
    }
}
