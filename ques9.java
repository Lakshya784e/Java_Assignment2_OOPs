import java.util.Scanner;

abstract class ThreeDObject {
    // Abstract methods to calculate surface area and volume
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    private double length, width, height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Overriding methods
    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    private double side;

    // Constructor
    public Cube(double side) {
        this.side = side;
    }

    // Overriding methods
    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Overriding methods
    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius, height;

    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Overriding methods
    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Box
        System.out.print("Enter length, width, and height of the box: ");
        double boxLength = scanner.nextDouble();
        double boxWidth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();
        ThreeDObject box = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Cube
        System.out.print("\nEnter side of the cube: ");
        double cubeSide = scanner.nextDouble();
        ThreeDObject cube = new Cube(cubeSide);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Cylinder
        System.out.print("\nEnter radius and height of the cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        ThreeDObject cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Cone
        System.out.print("\nEnter radius and height of the cone: ");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        ThreeDObject cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());
    }
}
