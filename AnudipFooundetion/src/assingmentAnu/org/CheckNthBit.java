package assingmentAnu.org;

import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number and bit position
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        System.out.print("Enter the bit position to check (0-based index): ");
        int n = scanner.nextInt();

        // Calculate mask and check if the nth bit is set
        int mask = 1 << n; // Shift 1 left by n positions
        boolean isSet = (num & mask) != 0; // Check if nth bit is set

        // Display result
        if (isSet) {
            System.out.println("The " + n + "th bit is set (1).");
        } else {
            System.out.println("The " + n + "th bit is not set (0).");
        }

        scanner.close();
    }
}

