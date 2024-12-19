package Assignments;

import java.util.Scanner;

public class Atwo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur number :");
		
		int num = s.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num+ "Your number is even");
		}
		else {
			System.out.println(num + "Your number is odd");
		}
		
		
		for (int i = num - 1; i>1; i--) {
			if (num % i == 0) {
				System.out.println(num + " Your Number is Not Prime");
				break;
			}
			if (i == 1) {
				System.out.println(num + " Your Number is prime");	
			}
		}
		
	}

}
