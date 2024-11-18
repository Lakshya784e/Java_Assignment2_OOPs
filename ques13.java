class Animal {
    public void eat() {
        System.out.println("Animal eats food.");
    }
}

// Derived class 1
class Mammal extends Animal {
    public void sleep() {
        System.out.println("Mammal sleeps.");
    }
}

// Derived class 2 (Multilevel Inheritance)
class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog barks.");
    }
}
public class ques13 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Calling methods from all levels of inheritance
        dog.eat();   // From Animal class
        dog.sleep(); // From Mammal class
        dog.bark();
    }
}
