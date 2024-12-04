package assingmentAnu.org;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter a year: ");
			int year = scanner.nextInt();
			
			//check if the year is a leap year
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						System.out.println(year + " is a leap year.");
					}else {
						System.out.print(year + " is not a leap year.");
					}
			}else {
				System.out.println(year + " is a leap year.");
			}
		} else {
			System.out.println(year + " is not a leap year.");
		}
			scanner.close();

	}

}
