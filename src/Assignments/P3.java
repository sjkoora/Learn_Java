package Assignments;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter First number : ");
int a= sc.nextInt();
System.out.println("Enter second number : ");
int b= sc.nextInt();
System.out.println("Enter Third number : ");
int c= sc.nextInt();
//int smallest=(a<b)? a: b;
//int largest=(c>(a>b)? a: b;)? c: ((a>b)? a: b;);
int smallest=(c<((a<b)? a: b))? c:((a<b)? a: b);
System.out.println("smallest number  is: "+smallest);
	}

}
