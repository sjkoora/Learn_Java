package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("enter your FirstNumber : ");
        int num1 = S.nextInt();
        
        System.out.println("enter your SecondNumber : ");
        int num2 = S.nextInt();
        
		int a[] = { 1, 4, 665, 65 };
		System.out.println("GivenArray is"+Arrays.toString(a));
		int length = a.length;
		System.out.println("Length of Array : " + length);
		int largest = a[0];
		int smallest = a[0];
		int num3 =77;
		for (int i = 0; i < length - 1; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
			if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		System.out.println("Largest number in theArray : " + largest);
		System.out.println("Smallest number in theArray : " + smallest);
		
		//adding two numbers
		System.out.println("************************* " );
		
		int result = calculation.sum(num1, num2);
		System.out.println("Sum  of two given numbers: "+result);
		
		//swapping two numbers without temporary variable
		System.out.println("***********************");
		System.out.println("Given numbers are :" +num1+ " And "+ num2);
		num1 = num1 +num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("After swapping : "+num1+ " and "+num2);
		
		//Chk given number is positive r negative
		System.out.println("***********************");
		System.out.println("Given numbers are : " +num1+ " And "+ num2);
		if(num1 > 0 && num2 >0) {
			System.out.println("both Numbers is positive");
		} else if(num1 > 0 && num2 >0){
			System.out.println("Both Numbers is negative");
		}else if(num1 == 0 || num2 == 0){
			System.out.println(" ONe of both Numbers is Zero");
		}else {
			System.out.println("both numbers are different signs");
		}
		
		if (num1  == num2 ) {
			System.out.println("both numbers are equal");
		}
		
//		if(num2 > 0) {
//			System.out.println("Number is positive");
//		} else if(num2 < 0){
//			System.out.println("Number is negative");
//		}else{
//			System.out.println("Number is Zero");
//		}
		System.out.println("***********************");
		//Finding Absolute value
		System.out.println("Given numbers are : " +num1+ " And "+ num2);
		
		int absolutevalue=Math.abs(num1);
		int absolutevalue1=Math.abs(num2);
		System.out.println("Absolute values of "+ num1 +" And " +num2+" are "+absolutevalue +" and "+absolutevalue1);
		
		System.out.println("***********************");
		//Finding largest of 3 numbers	
		System.out.println("Given numbers are : " +num1+ " And "+ num2+ " And "+num3);
		int greatest = calculation.FindGreatest(num1,num2,num3);
		//Another method by creating method in another class
	//	int greatest;
//		if(num1 > num2 && num1 >num3) {
//			greatest=num1;
//			
//		}else if(num2 > num1 && num2 > num3){
//			greatest = num2;
//			
//		}else {
//			greatest =num3;
//			
//		}
		System.out.println(greatest+" is greatest");
		
		System.out.println("***********************");
		//print from 1 to 10
		for(int i =1;i<=10;i++) {
			System.out.println("Printing Numbers from 1 to 10");
			System.out.print(i);
		}
		
		System.out.println("***********************");
		//Sum of first N natural nUmbers
		System.out.println("Given numbers are : " +num1);
		int Total=0;
		for(int i = 1;i<=num1;i++) {
			Total += i;
		}
		System.out.println("Sum of first Ntural numbers : "+num1+" is "+Total);
		
		System.out.println("***********************");
		//Multiplication Table of nUmbers
		System.out.println("Given numbers are : " +num2);
		System.out.println("Multiplication Tables  of : " +num2+ " is : ");
		for(int i = 1;i<=10;i++) {
			int tables = num2 * i ;
			System.out.println(num2+" * "+i+" = "+tables);
		}
		
		System.out.println("***********************");
		//count Digits in a number
		System.out.println("Given numbers are : " +num1);
		int count =0;
		int N=num1;
		while(N !=0) {
			N/= 10;
			count++;
		}
		System.out.println("count Digits in a number : " + num1 +" is "+count);
		

		System.out.println("***********************");
		//PowerCalculation

		System.out.println("enter the base number");
		int base =S.nextInt();
		System.out.println("enter the Exponent number");
		int Exponent =S.nextInt();
		int Reeesult=1;
		for(int i = 0;i < Exponent;i++) {
			Reeesult*= base;
		}
		System.out.println(base+" raised to power "+Exponent+" is "+Reeesult);
		
		System.out.println("***********************");
		//Armstrong Number
		
		S.close();
		
	}


	}
	
class calculation {
	public static int sum(int num1, int num2) {
		return num1+ num2 ;
		
	}
	public static int FindGreatest(int num1, int num2,int num3) {
		return (Math.max(Math.max(num1, num2),num3)) ;
	}
}
