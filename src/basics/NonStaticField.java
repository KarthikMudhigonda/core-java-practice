package basics;

public class NonStaticField {
    int id = 100;

    public static void main(String[] args) {
        NonStaticField student = new NonStaticField();
        System.out.println(student.id);
    }

}
