package Assignments;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		// palindrome
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		int originalNumber = num;
		int reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}
		if (originalNumber == reverse) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");
		}
		sc.close();
	}

}
