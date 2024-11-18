
class Animal {

    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("barks");
    }
}

class Cat extends Animal {

    void meows() {
        System.out.println("meows");
    }
}

public class ques5 {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.walk();

    }
}
