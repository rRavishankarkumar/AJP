package AssingmentDay3;

import java.util.Scanner;

public class leapYearOrNot {
	public static void main(String [] args) {
		 // Create a Scanner object to take input from the user
		
		Scanner scanner = new Scanner(System.in);
		
		//By User to Enter the year
		System.out.println("Enter a year: ");
		int year = scanner.nextInt();
		
		//check if the year is a leap year
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		}else {
			System.out.println(year + " is not a leap year.");
		}
		
		//close the scanner
		scanner.close();
	}

}
