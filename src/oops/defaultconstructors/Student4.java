package oops.defaultconstructors;

public class Student4 {
    int id;
    String name;
    //creating a parameterized constructor
    Student4(int i,String n){
    id = i;
    name = n;
    
}
void display(){System.out.println(id+" "+name);}
//method to display values
public static void main(String[] args) {
    //creating objects and passing values
    Student4 s1=new Student4(111, "kevin");
    Student4 s2=new Student4(222, "root");
    //calling method to display the values of object
    s1.display();
    s2.display();
}
}
/*
 * created the constructor of Student class that have two parameters. We can
 * have any number of parameters in the constructor.
 */