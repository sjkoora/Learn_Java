package javaControlStatements;

import java.util.Scanner;

public class MultipleIF {

	public static void main(String[] args) {
		// nested if conditions
		// display week names based on week number
		// int WNumber = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number (WNumber): ");
		int WNumber = scanner.nextInt();
		if (WNumber == 1) {
			System.out.println("Sunday");
		} else if (WNumber == 2) {
			System.out.println("Monday");
		} else if (WNumber == 3) {
			System.out.println("tuesday");
		} else if (WNumber == 4) {
			System.out.println("wednesday");
		} else if (WNumber == 5) {
			System.out.println("thursday");
		} else if (WNumber == 6) {
			System.out.println("Friday");
		} else if (WNumber == 7) {
			System.out.println("saturday");
		} else {
			System.out.println("invalid week number");
		}
	}

}
