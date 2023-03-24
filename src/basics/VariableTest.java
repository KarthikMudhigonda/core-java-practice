package basics;

public class VariableTest {
    // static int age = 28; // class level variable
    static String name = "Shailendra";
    char gender = 'M';
    public static void main(String[] args) {
        int age = 28; // local variable
        System.out.println("My age is: " + age);
        getMyName();
        getMyAge();
    }

    public static void getMyAge() {
        int age = 30;
        System.out.println("My age from new function is: " + age);
    }
    public static void getMyName() {
        System.out.println("My Name is " + name);
        System.out.println("This is a second line");
    }
    
}
