package loops;

public class BreakStatement1 {
    public static void main(String[] args) {
        for (int k = 0; k <= 20; k++) {
            System.out.println(k);
            if (k == 5) {
                break;
            }
        }
    }

}
