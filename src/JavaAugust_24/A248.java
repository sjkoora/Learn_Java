package JavaAugust_24;

import java.util.Scanner;

public class A248 {

	public static void main(String[] args) {
		String name;
	String members = "Swapna";
		System.out.println("Good Morning");
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your  name:");
	name =scanner.nextLine();

	if(name == members) {
		System.out.println("You are our member");
		
	}
	else {
		System.out.println("You are  not our member");
	}
	scanner.close();
	}

}
