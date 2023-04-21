package oops.defaultconstructors;

public class ExplicitConstructor {
    int i;

    public static void main(String[] args) {
        ExplicitConstructor m = new ExplicitConstructor(100);
        System.out.println(m.i);
    }

    public ExplicitConstructor() { // parameterless constructor
        i = 200;
    }

    public ExplicitConstructor(int a) { // parameterized constructor
        i = a;

    }
}
