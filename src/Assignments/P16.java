package Assignments;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		// given number is prime r not
		// conditons
		// number shld be > 1
		// 2 factors 1 n itself
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int count = 0;
		//num = Math.abs(num);
		if (num > 1) 
		{
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
				count++;}
			}
			if (count == 2) {
				System.out.println("it is prime number");
			} else {
				System.out.println("Not a prime number");
			}
		} else {
			System.out.println("Not a prime number");
		}
		sc.close();
	}
}
