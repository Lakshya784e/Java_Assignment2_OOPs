class Person {
    String name;
    int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called.");
    }

    // Constructor with one parameter
    public Person(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Constructor with one parameter called.");
    }

    // Constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with two parameters called.");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ques4 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();
        Person p2 = new Person("Raghav");
        p2.display();
        Person p3 = new Person("Raghav", 18);
        p3.display();
    }
}
