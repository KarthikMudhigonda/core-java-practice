package ControlFlow;

public class NestedIf {
    public static void main(String[] args) {
        
        String address = "Delhi, India";

        if(address.endsWith("India")){
            if(address.contains("Noida")){
                System.out.println("You're city is noida");
            }else if(address.contains("Gwalior")){
                System.out.println("You're city is Gwalior");
            }else {
            System.out.println(address.split(",")[0]);
        }
    }else{
        System.out.println("You're not living in India");
    }
    }
    
}
