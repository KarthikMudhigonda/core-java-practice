package basics;

public class Narrowing{
    public static void main(String[] args){
        double d = 39.39d;      
        int a = (int)d;     // '(int)' is the syntax used for explicit casting, 
        //and narrowing is a type of explicit conversion where a value of a larger data type is converted into a smaller data type.
        System.out.println(d);
        System.out.println(a);
    }
}