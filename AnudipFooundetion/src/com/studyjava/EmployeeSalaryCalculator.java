package com.studyjava;

import java.util.Scanner;

class User {
    String id; // String type for alphanumeric ID
    String name;

    // Parameterized constructor
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends User {
    double salary;

    public Employee(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id;
        while (true) {
            System.out.print("Enter Employee ID: ");
            id = scanner.nextLine();
            
            // Validate ID using regex
            if (id.matches("^[a-zA-Z0-9]+$")) {
                break;
            } else {
                System.out.println("Invalid ID! Employee ID should contain only alphabets and numbers. Try again.");
            }
        }

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Monthly Salary: ");
        double salary = scanner.nextDouble();

        // Create Employee object
        Employee employee = new Employee(id, name, salary);

        // Display employee details
        System.out.println("\n********** Employee Details: ********** ");
        System.out.println("Employee ID: " + employee.id);
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee Monthly Salary: " + employee.salary);
        System.out.println("Employee Annual Salary: " + employee.calculateAnnualSalary());

        scanner.close();
    }
}
