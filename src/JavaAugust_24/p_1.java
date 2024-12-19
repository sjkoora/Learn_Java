package JavaAugust_24;

import java.util.Scanner;

public class p_1 {

	public static void main(String[] args) {
		int N ;
		int fact =1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		N = scanner.nextInt();
		for(int i=1;i <= N;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of the Number "+N+ " is "+fact);
		}

	

}
