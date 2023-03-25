package Operaters;

public class UnaryOperator {
    public static void main(String[] args){
    int a = 18; 
    System.out.println(a++);  //postfix operator print increment in next
    System.out.println(a);
    System.out.println(++a);  // prefix operator prints immediate
    System.out.println(a);
    System.out.println(--a);  //postfix operator prints immediate
    System.out.println(a);
    System.out.println(a--);  //prefix operator prints later
    System.out.println(a);

    
}
}
