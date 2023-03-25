package basics;

public class ThreeTypesVariables {  
     static int m=100; /*static variable - creates a single copy of the static variable, 
     share it among all the instances of the class, 
     Memory allocation for static variables happens only once when the class is loaded in the memory.*/
    void method()  
    {    
        int n=90;/*local variable - inside the body of the method, 
        other methods in the class aren't even aware that the variable exists.*/
    }  
    public static void main(String args[])  
    {  
        int data=50; //instance variable - variable declared inside the class but outside the body of the method.  
        
          
    }  
}//end of class    
    
