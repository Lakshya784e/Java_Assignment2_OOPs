class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    // Constructor to initialize Vehicle details
    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    // Method to show data of the Vehicle
    public void showData() {
        System.out.println("This is a Vehicle class.");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    // Constructor to initialize Bus details
    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);  // Calling the Vehicle constructor
        this.routeNumber = routeNumber;
    }

    // Overriding the showData method
    @Override
    public void showData() {
        super.showData();  // Calling Vehicle's showData
        System.out.println("Bus Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    // Constructor to initialize Car details
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);  // Calling the Vehicle constructor
        this.manufacturerName = manufacturerName;
    }

    // Overriding the showData method
    @Override
    public void showData() {
        super.showData();  // Calling Vehicle's showData
        System.out.println("Car Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

public class ques10 {
    public static void main(String[] args) {
        Bus bus = new Bus("AB123CD", 60, "Yellow", "John Doe", 101);
        System.out.println("Bus Information:");
        bus.showData();  // Calling Bus showData
        System.out.println();

        // Creating a Car object
        Car car = new Car("XY987ZT", 120, "Red", "Jane Smith", "Toyota");
        System.out.println("Car Information:");
        car.showData();  
    }
}
