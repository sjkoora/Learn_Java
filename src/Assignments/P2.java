package Assignments;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// largest of two/3 numbers
		//ex-1 using ternary operator
		int a=100,b=45,c=55;
	int	largest1 =(a>b)? a: b;
	int largest2=(c>largest1)? c:largest1;
	//u can combile two statements to one
	//int largest=(c>(a>b)? a: b;)? c: ((a>b)? a: b;);
	System.out.println("Grater number between a&b&c is: "+largest2);
	
	//ex-2
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter First number: ");
	int i=sc.nextInt();
	System.out.println("Enter Second number: ");
	int j=sc.nextInt();	
	System.out.println("Enter Third number: ");
	int z=sc.nextInt();
	if(i>j && i>z) {
		System.out.println("Grater number  is: "+i);
	}
	else if(j>i && j>z) {
		System.out.println("Grater number is: "+j);
	}
	else {
		System.out.println("Grater number  is: "+z);
	}
	
	//ex-3
	}

}
