package JavaAugust_24;
import java.util.Scanner;
public class August_24 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name");
		String name = scanner.nextLine();
		System.out.println("Hello"+name);
		
		System.out.println("What is your age");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("you are " +age+ " years old");
		System.out.println("What is your fav food");
		String food = scanner.nextLine();
		System.out.println("My fav food is " +food);

	}

}
