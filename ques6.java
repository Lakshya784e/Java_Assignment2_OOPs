
class Animals {

    public void sound() {
        System.out.println("sounds");
    }
}

class Cats extends Animals {

    public void sound() {
        System.out.println("cat meows");
    }
}

class Dogs extends Animals {

    public void sound() {
        System.out.println("barks");
    }
}

public class ques6 {

    public static void main(String[] args) {
        Animals a = new Animals();
        a.sound();
        Cats c = new Cats();
        c.sound();
        Dogs d = new Dogs();
        d.sound();
    }
}
