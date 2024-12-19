package JavaAugust_24;

import java.util.Scanner;

public class A_249 {

	public static void main(String[] args) {
		// whileloop
		Scanner scanner = new Scanner(System.in);
		String name = "";
		do {
			System.out.println("Enter your name:");
			name = scanner.nextLine();
		}while (name.isBlank());

		System.out.println("Hello " + name);
	}

}
