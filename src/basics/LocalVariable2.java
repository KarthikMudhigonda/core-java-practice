package basics;

public class LocalVariable2 {
    public static void main(String[] args){
        int tea = 12;     //local variable is tea
        float price = tea;    //local variable is price because both are inside method.
        System.out.println(price);
        System.out.println(tea);
    }
}
