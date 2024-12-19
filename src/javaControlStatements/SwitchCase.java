package javaControlStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// It will reduce code
		// with min code achieve larger task
		/*
		 * Syntax switch(variable) { case value 1:statements; case value 1:statements;
		 * case value 1:statements; default :statements; }
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number (WNumber): ");
		int WNumber = scanner.nextInt();
		switch (WNumber) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("saturday");
		default:
			System.out.println("invalid week number");
		}
	}

}
