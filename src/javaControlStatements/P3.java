package javaControlStatements;

public class P3 {

	public static void main(String[] args) {
		// instead of writing expression we can write boolean value
		if (true) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}

		// example
		if (1 == 2) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}
		// example 2
		if (true) {

			if (true) {
				System.out.println("abc");
			} else {
				System.out.println("xyz");
			}
		} else {
			System.out.println(122);
		}
	}

}
