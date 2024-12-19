package Assignments;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		// Count no of digits in number
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int number =sc.nextInt();
		int Count =0;
		int temp = Math.abs(number);//to ignore -ve signs
		if (temp == 0) {
			Count = 1;			
		}
		else {
			while(temp != 0) {
				temp/=10;
				Count ++;
			}
		}
		System.out.println("The number of digits is:" + Count);

	}

}
