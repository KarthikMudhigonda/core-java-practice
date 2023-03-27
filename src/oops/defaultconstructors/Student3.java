package oops.defaultconstructors;

public class Student3 {
    int id;
    String name;
    
    // method to display the value of id and name
    void dispaly(){System.out.println(id+" "+name);}
    public static void main(String[] args) {
        // creating objects
        Student3 s1=new Student3();
        Student3 s2=new Student3();
        // displaying values of the object
        s1.dispaly();
        s2.dispaly();
    }
}
/*
 * In the above class,you are not creating any constructor so compiler provides
 * you a default constructor. Here 0 and null values are provided by default
 * constructor.
 */