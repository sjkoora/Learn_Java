package Assignments;

public class simplecalculator {

	public static void main(String[] args) {
		// we are doing arthmetic operations using this program
		int num1 = 10;
		int num2 = 5;
		System.out.println("Addition : " + (num1 + num2));
		System.out.println("Subtraction : " + (num1 - num2));
		System.out.println("Multiplication : " + (num1 * num2));

		if (num2 != 0) {
			System.out.println("Division : " + (num1 / num2));
		} else {
			System.out.println("Division by zero is not allowed");
		}
	}

}
