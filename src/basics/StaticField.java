package basics;

public class StaticField {
    static String colour = "blue";
    int example = 10;

    public static void main(String[] args) {
        System.out.println(colour);
        System.out.println(new StaticField().example);
    }

}
