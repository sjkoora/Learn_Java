package Assignments;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// Print week number based on week name
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day name");
		String dayname = sc.nextLine().trim().toLowerCase();
		int weekNumber;
		switch (dayname) {
		case "monday":
			weekNumber = 1;
			break;
		case "Tuesday":
			weekNumber = 2;
			break;
		case "Wednesday":
			weekNumber = 3;
			break;
		case "Thursday":
			weekNumber = 4;
			break;
		case "Friday":
			weekNumber = 5;
			break;
		case "Saturday":
			weekNumber = 6;
			break;
		case "Sunday":
			weekNumber = 7;
			break;
			default:
				weekNumber = -1;
		}
		 if (weekNumber == -1) {
	            System.out.println("Invalid day name!");
	        } else {
	            System.out.println("WeekNumber: " + weekNumber);
	        }

	       sc.close();
	}

}
