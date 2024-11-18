class Distance {
    // Instance variable to store distance in miles
    protected double miles;

    // Constructor to initialize distance
    public Distance(double miles) {
        this.miles = miles;
    }

    // Method to calculate and display the travel time assuming speed is 60 miles per hour
    public void travelTime() {
        double speedMph = 60; // Speed in miles per hour
        double time = miles / speedMph; // Time = Distance / Speed
        System.out.println("Time to cover " + miles + " miles at 60 mph: " + time + " hours.");
    }
}

class DistanceMKS extends Distance {
    // Constructor to initialize distance in miles for DistanceMKS class
    public DistanceMKS(double miles) {
        super(miles); // Call the parent constructor to initialize miles
    }

    // Overriding travelTime() method to calculate time assuming the distance is in kilometers
    @Override
    public void travelTime() {
        double kilometers = miles * 1.60934; // Convert miles to kilometers (1 mile = 1.60934 kilometers)
        double speedKps = 100; // Speed in kilometers per second
        double time = kilometers / speedKps; // Time = Distance / Speed
        System.out.println("Time to cover " + kilometers + " kilometers at 100 km/s: " + time + " seconds.");
    }
}


public class ques12 {
    public static void main(String[] args) {
        Distance distanceObj = new Distance(120);
        distanceObj.travelTime(); // Call the travelTime() method for miles

        System.out.println();

        // Create a DistanceMKS object with distance in miles
        DistanceMKS distanceMKSObj = new DistanceMKS(120);
        distanceMKSObj.travelTime(); 
    }
}
