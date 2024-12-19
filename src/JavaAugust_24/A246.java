package JavaAugust_24;

import java.util.Random;
import java.util.Scanner;

public class A246 {

	public static void main(String[] args) {
		// switch and break
//		Scanner scanner = new Scanner(System.in);

		// String day;
//day = scanner.nextLine();
		// System.out.println("Enter Day:");

		Random random = new Random();
		int day = random.nextInt(7) + 1;

		switch (day) {
		case 1:
			System.out.println("It is Sunday");
			break;
		case 2:
			System.out.println("It is Monday");
			break;
		case 3:
			System.out.println("It is Tuesday");
			break;
		case 4:
			System.out.println("It is Wednesday");
			break;
		case 5:
			System.out.println("It is Thurday");
			break;
		case 6:
			System.out.println("It is Friday");
			break;
		default:
			System.out.println("This is not a day");
		}
	}

}
