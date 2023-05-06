package arrays;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("Karthik");
        v1.add("Arun");
        v1.add(0, "Raj");
        v1.add("John");
        v1.add("Summer");
        v1.add("K1");
        v1.add("K2");
        v1.add("K3");
        v1.add("K4");
        v1.add("K5");
        v1.add(4, "K6");

        Vector v2 = new Vector();
        v2.add("K7");
        v1.addAll(1, v2);

        System.out.println("Size: " + v1.size()); // Size is no of elements present in list
        System.out.println("Size: " + v2.size());
        System.out.println("Capacity: " + v1.capacity()); // Capacity is Array's capacity
        System.out.println("Capacity: " + v2.capacity());
        System.out.println(v1);
        System.out.println(v2);

    }

}
