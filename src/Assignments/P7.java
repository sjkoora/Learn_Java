package Assignments;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// Reverse number
		// % and / = operators with looping
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int original = sc.nextInt();
		int reversed = 0;
		while (original != 0) {
			int digit = original % 10;// get last digit
			reversed = reversed * 10 + digit;// appened number to reversed
			original /= 10;

		}
		System.out.println("Reversed number: " + reversed);
		sc.close();

	}

}
