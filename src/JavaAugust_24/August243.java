package JavaAugust_24;

import java.util.Scanner;

public class August243 {

	public static void main(String[] args) {
		  
//		double x = 3.14;
//		double y = 10;
//		double z = 	Math.sqrt(y);
//		System.out.println(z);
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value a: ");
		a = scanner.nextDouble();
		
		System.out.println("Enter value b: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt(a*a + b*b);
		
		System.out.println("Your hypotenuse is: " + c);
		scanner.close();
		
	}

}
