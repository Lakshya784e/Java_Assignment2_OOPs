import java.util.Scanner;

class Employee {
    // Instance variables
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;

    // Constructor to initialize the employee details
    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }

    // Method to calculate gross salary
    public void calculateGrossSalary() {
        // Assuming some basic allowances (e.g., HRA = 10%, DA = 5%, and other benefits = 2%)
        double hra = basic_salary * 0.10; // House Rent Allowance
        double da = basic_salary * 0.05;  // Dearness Allowance
        double otherBenefits = basic_salary * 0.02; // Other benefits

        // Gross salary calculation
        gross_salary = basic_salary + hra + da + otherBenefits;
    }

    // Method to display the employee details and gross salary
    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }
}
public class ques14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking employee details as input from the user
        System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();

        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(emp_id, emp_name, basic_salary);

        // Calculate the gross salary
        employee.calculateGrossSalary();

        // Display the employee details along with the gross salary
        employee.display();
    }
}
