package Loops;

public class JavaForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Delhi", "Mumbai", "Hyderabad", "Bangalore"};
        System.out.println("Four major cities in India are ");
        for(String name:names){
            System.out.println(name);
        }
    }
    
}
