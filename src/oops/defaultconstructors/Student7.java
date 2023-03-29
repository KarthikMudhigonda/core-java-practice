package oops.defaultconstructors;

class Student7 {
    int id;
    String name;

    public static void main(String[] args) {
        Student7 s1 = new Student7(111, "Kevin");
        Student7 s2 = new Student7();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.display();
        s2.display();

    }

    Student7(int i, String n) {// parameterized constructor
        id = i;
        name = n;
    }

    Student7() { // default constructor
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }

    void display() {
        System.out.println(id + " " + name);
    }

}
