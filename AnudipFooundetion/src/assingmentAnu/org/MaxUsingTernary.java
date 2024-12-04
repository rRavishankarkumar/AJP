package assingmentAnu.org;

import java.util.Scanner;

public class MaxUsingTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Use the ternary operator to find the maximum
        int max = (num1 > num2) ? num1 : num2;

        // Output the result
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}

