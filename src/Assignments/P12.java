package Assignments;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number : ");
		int number = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		int temp = Math.abs(number);
		while(temp!=0) {
			int digit = temp % 10;
		
		if(digit % 2 ==0) {
			evenCount++;
		}
		else {
			oddCount++;
		}
		temp /= 10;
		}
		System.out.println("Total Even numbers : "+evenCount);
		System.out.println("Total Odd numbers : "+oddCount);
		sc.close();
	}

}
