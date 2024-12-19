package Assignments;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 6 digit number : ");
		int originalNumber = sc.nextInt();
		int reverseNumber = 0;
		while (originalNumber != 0) {
			int digit = originalNumber % 10;
			reverseNumber = reverseNumber * 10 + digit;
			originalNumber /= 10;
		}
		System.out.println("Reverse of original number is" + reverseNumber);
		sc.close();

	}

}
