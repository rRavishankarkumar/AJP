package assingmentAnu.org;

import java.util.Scanner;

class Bank {
    private double amount; // Instance variable for account balance

    // Parameterized constructor to initialize the balance
    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    // Method to withdraw money
    public void withdraw(double withdrawalAmount) {
        // Check if the amount is sufficient using a ternary operator
        String message = (withdrawalAmount <= amount) 
                ? "Withdraw successful!" 
                : "Insufficient balance!";
        System.out.println(message);

        // Update balance if withdrawal is successful
        amount = (withdrawalAmount <= amount) ? amount - withdrawalAmount : amount;
    }

    // Method to deposit money
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful!");
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Bank object with initial balance of 10000
        Bank account = new Bank(10000);

        // Display initial balance
        System.out.println("Initial balance: " + 10000);

        // Take withdrawal input from the user
        System.out.print("Enter the amount to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        // Deposit 5000 into the account
        account.deposit(5000);

        // Display the total balance
        account.displayBalance();

        scanner.close();
    }
}

