package oops;

class Student {
    int id;
    String name;
}

class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id = 101;
        s1.name = "Sonoo";
        s2.id = 102;
        s2.name = "Karthik";
        System.out.println(s1.id + " " + s1.name);// printing members with a white space
        System.out.println(s2.id + " " + s2.name);
    }
}