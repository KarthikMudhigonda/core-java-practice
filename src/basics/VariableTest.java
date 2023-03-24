package basics;

import java.util.Calendar;

public class VariableTest {
    // static int age = 28; // class level variable
    static String name = "Shailendra";
    char gender = 'M';
    Calendar c;
    public static void main(String[] args) {
        int age = 28; // local variable
        System.out.println("My age is: " + age);
        String myName = getMyName();
        // int myAge = getMyAge();
        // System.out.println("my age: " + getMyAge());
        System.out.println("My name is " + myName);
    }

    public static int getMyAge() {
        int age = 30;
        // System.out.println("My age from new function is: " + age);
        getMyName();
        return age;
    }
    public static String getMyName() {
        // System.out.println("My Name is " + name);
        // System.out.println("This is a second line");
        name = "Srihith";
        return name;
    }
    
}
