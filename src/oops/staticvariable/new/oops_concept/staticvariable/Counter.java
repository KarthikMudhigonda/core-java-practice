package oops.staticvariable;
//Program of the counter without static variable
//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  

 class Counter {
    int count = 0; // will get memory each time when the instance is created
    Counter(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

    }
}
