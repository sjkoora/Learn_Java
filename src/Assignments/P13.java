package Assignments;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		// Sum of digits in a Number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = sc.nextInt();
		int count = 0;
		number = Math.abs(number);
		while (number != 0) {
			int digit = number % 10;
			count = count + digit;
			number /= 10;
		}
		System.out.println("Sum of all digits :" + count);
		sc.close();
	}

}
