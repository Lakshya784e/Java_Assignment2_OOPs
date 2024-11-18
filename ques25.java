import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
public class ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            if (username.length() < 6) {
                throw new InvalidUsernameException("Username must be at least 6 characters.");
            }

            String correctPassword = "password123";  // Predefined correct password

            if (!password.equals(correctPassword)) {
                throw new InvalidPasswordException("Password does not match.");
            }

            System.out.println("Authentication successful.");

        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
