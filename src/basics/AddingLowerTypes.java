package basics;

public class AddingLowerTypes {
    public static void main(String[] args){

        byte a = 9;
        byte b = 4;
        byte c = 6;
        byte d = (byte)(a+b+c);
        System.out.println(d);

        byte e = (byte)(a+b);
        System.out.println(e);

        byte f = a;
        System.out.println(f);
    }
    
}
