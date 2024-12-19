package Assignments;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// Switch on Strings
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day of week : ");
		String Day = sc.nextLine().trim().toLowerCase();
		switch (Day) {
		case "monday":
			System.out.println("it is monday ");
			break;
		case "tuesday":
			System.out.println("it is Tuesday ");
			break;
		case "wednesday":
			System.out.println("it is Wednesday ");
			break;
		case "thursday":
			System.out.println("it is thursday ");
			break;
		case "friday":
			System.out.println("it is Friday ");
			break;
		default:

			System.out.println("invalid day ");
			
		}
		

	}

}
