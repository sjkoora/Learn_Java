package Array;

import java.util.Scanner;

public class Takingmultipleinputs {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 =sc.nextInt();
		System.out.println("Enter second number:");
		int num2 =sc.nextInt();
		System.out.println("Addition of 2 number:"+(num1+num2));
		System.out.println("Enter name:");
		String name =sc.next();
		System.out.println("your name is:"+name);
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("your name is:"+age);
		
		
		System.out.println("Enter unknown value :");
		Object value=sc.next();
		System.out.println(value);
	}

}
