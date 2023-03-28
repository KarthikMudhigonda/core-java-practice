package oops.staticvariable;

class Student{
    int  rollno; // instance variable
    String  name;
    static String college = "CMR"; // static variable
    
    // constructor
    Student(int i,String n){
        rollno = i;
        name = n;
    }
    
    // method to display the values
    void display(){System.out.println(rollno+" "+name+" "+college);}

}

// Test class to show the values of objects
public class TestStaticVariable1 {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Kevin");
        Student s2 = new Student(222, "Root");
        // we can change the college of all objects by the single line of code
        Student.college = "CMRCET";
        s1.display();
        s2.display();
    }
    
}
