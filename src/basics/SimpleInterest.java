package basics;

public class SimpleInterest {
    static double principal;
    static double interestPerAnnum;
    static int totalNumOfMonths;
    static int totalNumOfYears;
    static double finalAmount;

    // Constructor to set the initial values for the variables
    public SimpleInterest(double p, double i, int m, int y) {
        principal = p;
        interestPerAnnum = i;
        totalNumOfMonths = m;
        totalNumOfYears = y;
    }

    // Method to calculate the final amount after the given time period
    public static double calculateFinalAmount() {
        double totalInterest = principal * (interestPerAnnum / 100) * (totalNumOfMonths / 12.0);
        finalAmount = principal + totalInterest;
        return finalAmount;
    }

    public static void main(String[] args) {
        // Create an instance of the SimpleInterest class with initial values
        SimpleInterest si = new SimpleInterest(10_00_000, 7.5, 12, 2);

        // Calculate the final amount and print the result
        double result = si.calculateFinalAmount();
        System.out.println("Final amount after " + totalNumOfYears + " years is: " + result);
    }
}
