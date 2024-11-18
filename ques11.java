class Num {
    // Instance variable for the number
    protected int number;

    // Constructor to initialize the number
    public Num(int number) {
        this.number = number;
    }

    // Method to display the number
    public void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {

    // Constructor for HexNum class
    public HexNum(int number) {
        super(number); // Call the constructor of the base class (Num)
    }

    // Overriding the shownum method to display hexadecimal and octal values
    @Override
    public void shownum() {
        super.shownum(); // Call the base class method to show the original number
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}
public class ques11 {
    public static void main(String[] args) {
        Num numObj = new Num(255);
        numObj.shownum(); // Display the number using base class method
        
        System.out.println();

        // Create a HexNum object
        HexNum hexNumObj = new HexNum(255);
        hexNumObj.shownum();
    }
}
