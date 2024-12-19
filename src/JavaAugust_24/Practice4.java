package JavaAugust_24;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		int x;
		int fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		x = scanner.nextInt();
		System.out.println(" Number Entered: " + x);
		if (x < 0) {
			System.out.println("Number is negative number");
		} else {
			long factorial = 1;

		}
		for (int i = 1; i <= x; i++) {
			fact = fact * i;

		}
		System.out.println("The Factorial of " + x + " is " + fact);

	}

}
