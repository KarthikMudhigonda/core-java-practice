package basics;

public class Object {
    int i;
    int j;

    public Object() {
        i = 100;
        j = 299;
    }

    public Object(int i, int j) {
        this.i = i;
        this.j = j;

    }

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object(10, 30);
        Object o3 = new Object(45, 45);
        System.out.println(o1.add());
        System.err.println(o2.equals(o3));
        System.out.println(o2.add());
        System.out.println(o3.add());
    }

    public int add() {
        return i + j;
    }
}
