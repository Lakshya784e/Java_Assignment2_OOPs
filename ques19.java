
public class ques19 {

    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // Using 'throw' to throw an exception
            throw new IllegalArgumentException("Age is less than 18, not allowed.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            // Using 'try' to catch exceptions
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element 4: " + numbers[4]);  // This will throw ArrayIndexOutOfBoundsException

            // Calling a method that throws an exception
            checkAge(16);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Using 'catch' to handle ArrayIndexOutOfBoundsException
            System.out.println("Exception caught: " + e);
        } catch (IllegalArgumentException e) {
            // Using 'catch' to handle IllegalArgumentException
            System.out.println("Exception caught: " + e);
        } catch (Exception e) {
            // Catch any other generic exceptions
            System.out.println("Generic exception caught: " + e);
        } finally {
            // Using 'finally' block to always execute the cleanup code
            System.out.println("Finally block executed.");
        }

        // Using 'assert' for debugging (can be enabled with the '-ea' flag at runtime)
        int number = 5;
        assert (number > 10) : "Assertion failed! Number is not greater than 10.";

        System.out.println("Program execution continues after exception handling.");
    }
}
