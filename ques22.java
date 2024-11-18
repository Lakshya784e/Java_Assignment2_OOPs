class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class ques22 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            if (num2 == 0) {
                throw new CustomArithmeticException("Cannot divide by zero.");
            }
            int result = num1 / num2;

            int invalidResult = num1 / (num2 - num2); 
            if (invalidResult == 0) {
                throw new CustomArithmeticException("Invalid division, result is zero.");
            }
        } catch (CustomArithmeticException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
        System.out.println("Program execution continues after exception handling.");
    }
}
