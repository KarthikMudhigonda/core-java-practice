package loops;

public class Assignment4 {
    // Prime number from 50 to 150
    public static void main(String[] args) {
        int z = 50;
        while (z <= 150) {
            boolean isPrime = true;
            for (int i = 2; i < z; i++) {
                if (z % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(z + " is Prime");
            }
            z++;
        }
    }
}

// public class PrimeNumbers {
// public static void main(String[] args) {
// int num = 50;
// while (num <= 150) {
// if (isPrime(num)) {
// System.out.println(num + " is prime");
// }
// num++;
// }
// }

// public static boolean isPrime(int n) {
// if (n <= 1) {
// return false;
// }
// for (int i = 2; i <= Math.sqrt(n); i++) {
// if (n % i == 0) {
// return false;
// }
// }
// return true;
// }
// }
// Explain me how this boolean method works and will we use it more often
