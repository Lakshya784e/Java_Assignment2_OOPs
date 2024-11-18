interface Interface1 {
    void method1();
    void method2();
}

// Interface 2
interface Interface2 {
    void method3();
    void method4();
}

// Interface 3
interface Interface3 {
    void method5();
    void method6();
}

// Interface that inherits from all three interfaces and adds a new method
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void method7();
}

// Concrete class
class ConcreteClass {
    public void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}

// Class that implements the combined interface and inherits from ConcreteClass
class MyClass extends ConcreteClass implements CombinedInterface {
    public void method1() {
        System.out.println("Method 1 from Interface1");
    }

    public void method2() {
        System.out.println("Method 2 from Interface1");
    }

    public void method3() {
        System.out.println("Method 3 from Interface2");
    }

    public void method4() {
        System.out.println("Method 4 from Interface2");
    }

    public void method5() {
        System.out.println("Method 5 from Interface3");
    }

    public void method6() {
        System.out.println("Method 6 from Interface3");
    }

    public void method7() {
        System.out.println("Method 7 from CombinedInterface");
    }
}

// Methods that take interfaces as arguments
class InterfaceMethods {
    public void invokeInterface1(Interface1 i1) {
        i1.method1();
        i1.method2();
    }

    public void invokeInterface2(Interface2 i2) {
        i2.method3();
        i2.method4();
    }

    public void invokeInterface3(Interface3 i3) {
        i3.method5();
        i3.method6();
    }

    public void invokeCombinedInterface(CombinedInterface ci) {
        ci.method1();
        ci.method2();
        ci.method3();
        ci.method4();
        ci.method5();
        ci.method6();
        ci.method7();
    }
}
public class ques18 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        InterfaceMethods methods = new InterfaceMethods();

        // Calling methods with objects of MyClass
        methods.invokeInterface1(obj);
        methods.invokeInterface2(obj);
        methods.invokeInterface3(obj);
        methods.invokeCombinedInterface(obj);
    }
}
