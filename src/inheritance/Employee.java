package inheritance;

public class Employee {
    float salary = 30000;
}
class Programmer extends Employee{
    int bonus = 5000;
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer pay is: "+p.salary);
        System.out.println("Bonus for the year is: "+p.bonus);
    }
}
