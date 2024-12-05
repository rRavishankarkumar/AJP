package AssingmentDay3;

import java.util.Scanner;

class User {
    int id;                // User ID
    String name;           // User Name

    // Parameterized constructor to initialize id and name
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display user details
    public void displayUserInfo() {
        System.out.println("User ID: " + id);
        System.out.println("User Name: " + name);
    }
}

// Subclass Employee inheriting from User
class Employee extends User {
    double salary;         // Monthly salary

    // Constructor to initialize id, name, and salary
    public Employee(int id, String name, double salary) {
        super(id, name);   // Call the superclass constructor
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking user input for employee details
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double salary = scanner.nextDouble();

        // Creating an object of the Employee class
        Employee employee = new Employee(id, name, salary);

        // Displaying user details
        System.out.println("\n--- Employee Details ---");
        employee.displayUserInfo();

        // Calculating and displaying the annual salary
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Monthly Salary: $" + salary);
        System.out.println("Annual Salary: $" + annualSalary);

        // Close the scanner
        scanner.close();
    }
}

