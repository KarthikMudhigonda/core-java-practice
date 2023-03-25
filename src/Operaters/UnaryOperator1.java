package Operaters;

public class UnaryOperator1 {
    public static void main(String[] args){

        int a = 14;
        int b = 15;
        System.out.println(a++ + ++a);
        System.out.println(a-- + --a);
        System.out.println(b++ + b++);
        System.out.println(++b + ++b);
        System.out.println(++a - b++);
    } 
    
}
