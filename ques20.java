public class ques20 {
    public static void main(String[] args) {
        try {
            // Generating NegativeArraySizeException
            int size = -5;  // Negative size for array
            int[] arr = new int[size];  // This will throw NegativeArraySizeException

        } catch (NegativeArraySizeException e) {
            // Handling NegativeArraySizeException
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        try {
            // Generating ArithmeticException
            int num1 = 10;
            int num2 = 0;  // Dividing by zero to cause ArithmeticException
            int result = num1 / num2;  // This will throw ArithmeticException

        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        System.out.println("Program execution continues after exception handling.");
    }
}
