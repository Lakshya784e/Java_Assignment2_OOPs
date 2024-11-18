class Car {
    // Instance variables
    String brand;
    String model;
    int year;

    // Constructor to initialize the Car object
    public Car(String brand, String model, int year) {
        // Using 'this' to differentiate instance variables from local variables
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }

    // Method to demonstrate 'this' referring to the current object
    public void compareCar(Car otherCar) {
        if (this.brand.equals(otherCar.brand)) {
            System.out.println("Both cars are of the same brand: " + this.brand);
        } else {
            System.out.println("The cars are of different brands.");
        }
    }

    // Method to demonstrate 'this' used to call another constructor (Constructor Chaining)
    public Car() {
        this("Unknown", "Unknown", 0);  // Calling another constructor in the same class
    }
}

public class ques15 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2021);

        // Display car details
        car1.displayDetails();
        System.out.println();
        car2.displayDetails();

        // Compare the two cars
        car1.compareCar(car2);

        // Create a car object using the default constructor
        Car car3 = new Car();
        car3.displayDetails();
        
    }
}
