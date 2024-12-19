package Assignments;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// switch on integers
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose from 1-3 = ");
		int number = sc.nextInt();
		switch (number) {
		case 1:
			System.out.println("You chose one");
			break;
		case 2:
			System.out.println("You chose two");
			break;
		case 3:
			System.out.println("You chose three");
			break;
		default:
			System.out.println("You chose wrong number");
		}
		sc.close();
	}

}
