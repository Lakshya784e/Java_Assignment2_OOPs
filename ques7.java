class MethodOverloading{
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class ques7 {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.add(4,5));
        System.out.println(obj.add(2.34,4.934));
    }
}
