package javaControlStatements;

public class P2 {

	public static void main(String[] args) {
		// largest of the numbers
		//a>b and a>c   a is largest
		//b>a and b>c  b is largest
		//c>a and c>b  c is largest
		
		int x=10,b=23,y=78;
		if (x>b && x>y) {
			System.out.println("x is greater than b");
		}
		else if (b>x && b>y) {
			System.out.println("b is greater number");
		}
		else {
			System.out.println("y is largest Number");
		}

	}

}
