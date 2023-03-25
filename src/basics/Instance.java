package basics;

// Define a class named "Person"
class Person {
    // Define instance variables
    private String name;
    private int age;

    // Define a constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Define instance methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Create an instance of Person class and initialize it
Person person1 = new Person("John", 30);

// Access instance variables and methods using the dot operator
String person1Name = person1.getName();
int person1Age = person1.getAge();
person1.setName("David");
person1.setAge(35);

    
}
