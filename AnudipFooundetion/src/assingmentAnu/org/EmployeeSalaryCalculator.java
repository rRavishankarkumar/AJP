package assingmentAnu.org;

import java.util.Scanner;

class User{
	int id;
	String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

//subclass "Employee" inheriting from "User"

class Employee extends User{
	double salary;  //monthly salary of the employee
	
	// Parameterized constructor to initialize properties of both User and Employee
	public Employee(int id, String name, double salary) {
		super(id,name);
		this.salary = salary;
	}
	
	//Method to calculate annual salary
	public double calculateAnnualSalary() {
		return salary * 12;
	}
	
}

public class EmployeeSalaryCalculator {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter Employee ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter Employee Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter Employee Monthly Salary: ");
		double salary = scanner.nextDouble();
		
		//Create Employee object
		Employee employee = new Employee(id, name, salary);
		
		//Calculate and display annualSalary
		double annualSalary = employee.calculateAnnualSalary();
		System.out.println("\nEmployee Details: ");
		System.out.println("Employee ID: " + employee.id);
		System.out.println("Employee Name: " + employee.name);
		System.out.println("Employee Monthly Salary: "+ employee.salary);
		System.out.println("Employee Annual Salary: "+ annualSalary);
		
		scanner.close();

	}

}
