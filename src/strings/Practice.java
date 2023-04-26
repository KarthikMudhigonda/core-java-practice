package strings;

public class Practice {
    public static void main(String[] args) {
        String s1 = "Hey there";
        System.out.println(s1);
        String s2 = new String("Hey there");
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));

    }
}
