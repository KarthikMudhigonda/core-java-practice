package basics;

public class Bank {
    static int currentBalance = 5000;

    public static void greetCustomer() {
        System.out.println("Welcome to mobile banking");

    }

    public static void deposit(int amount) {
        currentBalance = currentBalance + amount;

    }

    public void withdrawal(int amount) {
        currentBalance = currentBalance - amount;

    }

    public int getCurrentBalance() {
        return currentBalance;

    }

    public static void main(String[] args) {
        greetCustomer();
        Bank bank = new Bank();
        deposit(2000);
        System.out.println("Current balance is: " + currentBalance);
        bank.withdrawal(1500);
        System.out.println("Current balance after withdrawal is: " + bank.getCurrentBalance());

    }

}
