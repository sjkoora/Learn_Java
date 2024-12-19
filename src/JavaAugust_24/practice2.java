package JavaAugust_24;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int Number =  scanner.nextInt();
		
	if(Number % 2==0) {
		System.out.println("It is even");
	}
	else {
		System.out.println("It is odd");
	}
	scanner.close();
	

	for(int i=0;i <=5;i++) {
		System.out.println("Line " + i);
		System.out.println(" ");
	}
	}
	
}
