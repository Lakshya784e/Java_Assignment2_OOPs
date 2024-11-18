import java.util.Scanner;

class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}
public class ques24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter candidate name: ");
        String name = sc.nextLine();

        System.out.print("Enter candidate age: ");
        int age = sc.nextInt();

        try {
            if (age > 45) {
                throw new TooOlder("Candidate is too old for the position.");
            } else if (age < 20) {
                throw new TooYounger("Candidate is too young for the position.");
            } else {
                System.out.println("Eligible");
                System.out.println("Candidate Name: " + name);
            }
        } catch (TooOlder e) {
            System.out.println(e.getMessage());
        } catch (TooYounger e) {
            System.out.println(e.getMessage());
        }

    }
}
