package Assignments;

import java.util.Scanner;

public class divisionWithEcxeptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Enter numerator:");
		Scanner sc= new Scanner(System.in);
		int numerator=sc.nextInt();
		System.out.println("Enter denominator");
		int denominator = sc.nextInt();
		try {
		int result =numerator/denominator;
		System.out.println("Result :"+result);
		}
	catch(ArithmeticException e) {
		System.out.println();
	}finally {
	    System.out.println("Program execution completed.");
	}

	}
}
