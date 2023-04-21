package loops;

public class WhileDoWhile {
    public static void main(String[] args) {
        int j = 0;
        while (j <= 6) {
            System.out.println(j + " " + "Condition satisfied");
            j++;
        }
        do {
            System.out.println(j);
            j++;
        } while (j <= 6);
    }

}
// I need to know how to debug a while loop using f5 and f6, what is into and
// step over where/why we use it
// Why there is 7 number with no condition satisfied
