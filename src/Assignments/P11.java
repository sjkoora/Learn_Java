package Assignments;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		String number = sc.nextLine().trim();
//ternary operators
//var=(exp)? a: b;
		int digitCount = (number.startsWith(" ")) ? number.length() - 1 : number.length();
		System.out.println("Number of Digits : " + digitCount);
		sc.close();
	}

}
