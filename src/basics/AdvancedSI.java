
package basics;

public class AdvancedSI {
    private double principal;
    private double interestRate;
    private int numMonths;

    public AdvancedSI(double principal, double interestRate, int numMonths) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.numMonths = numMonths;
    }

    public double calculateFinalAmount() {
        double interest = principal * (interestRate / 100) * (numMonths / 12.0);
        return principal + interest;
    }

    public static void main(String[] args) {
        AdvancedSI si = new AdvancedSI(1000, 5, 24);
        double finalAmount = si.calculateFinalAmount();
        System.out.println("Final amount after 2 years is: " + finalAmount);
    }
}
