package assingmentAnu.org;

import java.util.Arrays;

public class SubArrayAndSecondHighest {
    public static void main(String[] args) {
        // Input array
        int[] array = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};

        // Extract sub array from index 2 to 6 (inclusive)
        int[] subArray = Arrays.copyOfRange(array, 2, 7); // 7 is exclusive

        // Display the sub array
        System.out.println("Sub array: " + Arrays.toString(subArray));

        // Find the second highest element in the sub array
        int secondHighest = findSecondHighest(subArray);

        // Display the second highest element
        System.out.println("2nd Highest element: " + secondHighest);
    }

    // Method to find the second highest number in an array
    public static int findSecondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }

        return secondHighest;
    }
}
