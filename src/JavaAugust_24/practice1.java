package JavaAugust_24;

import java.util.Random;
import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		System.out.print("Hello");
		System.out.println("Good Morning");
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is Your Name?");
		String name = scanner.nextLine();
		System.out.println("Hello: " + name);
		System.out.println("What is Your Age??");
		int Age = scanner.nextInt();

		
		int y;
		Random random = new Random();
		int x = random.nextInt();
	}

}
