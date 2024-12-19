package Assignments;

import java.util.Scanner;

import javax.swing.Spring;


public class AOne {
	
	public static void main(String[] args) {
		// Number is prime
		Boolean prime = true;
		int even = 0;
		int odd = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int Number = sc.nextInt();
		System.out.print("Enter another number  Number1:");
		int Number1 = sc.nextInt();
		int Evennumber = 0;
		int OddNumber = 0;
		//System.out.println("Enter array of numbers : ");
		//int Arr = sc.nextInt();

		if (Number <= 1) {
			System.out.println("Number is not Prime");
			prime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(Number); i++) {
				if (Number % i == 0) {
					System.out.println(Number +" Number is not prime");
					prime = false;
					break;
				}
			}

		}

		if (prime) {
			System.out.println(Number + " is a PrimeNumber");
		} else {
			System.out.println(Number + " is not a PrimeNumber");
		}

		// find even n odd

		if (Number1 == 0) {
			System.out.println("Please enter a valid number");
		} else if (Number1 % 2 == 0) {
			System.out.println(Number1 + " Is Even NUmber");
		} else {
			System.out.println(Number1 + " Is odd NUmber");
		}
		
        // Reverse aString
		String Actual = "Awesome";
		String Reverse = " ";
		Reverse = new StringBuilder(Actual).reverse().toString();
		System.out.println("New Reverse String : " + Reverse);
		
		//Factorial of a Number
		
		//Number  already intialized
		int factorial = 1;
		for(int i= 1;i<=Number;i++) {
			factorial *=1;
		}
		System.out.println("Factorial of Number 1 :"+Number+" is "+factorial);
		
		int factorial2 = 1;
		for(int i= 1;i<=Number1;i++) {
			factorial2 *=1;
		}
		System.out.println("Factorial of  Number2 :"+Number1+" is "+factorial2);
		
		//Fibonacci Series-series of num each num is sum of two preceeding num
		//FB series-0,1,1,2,3,5,8...,0 and 1 are fixed
		//using loop
		int a=0;
		int b=1;
		int sum =0;
		System.out.println(a+ " "+b);//0,1
		for(int i = 2;i<10;i++) {
			sum = a+b;//
			System.out.println(" "+sum);//1,2,3
			a=b;//1
			b=sum;//1
		}
		//System.out.print("Fibonachi series till 10 : "+sum);
		
		//Palindrome
		if (Actual.equals(Reverse)) {
			System.out.println("String u entered is palindrome :"+Actual +" "+ Reverse);
		}else {
			System.out.println("String u entered is not palindrome :"+Actual +" "+ Reverse);
		}
		
		//???Array operatio (Find largesr n samllest)
		System.out.println("Array operations");
		
		
		System.out.println("Enter size of numbers : ");
		int size = sc.nextInt();
		//int Arr= sc.nextInt();
		int []Arr1 = new int[size];
		
		System.out.println("Enter  : "+size+ " elements");
		for(int i=0;i<size-1;i++) {
		Arr1[i] = sc.nextInt();
			}
		int Largest =0;
		int Smallest =Arr1[0];
		
		for(int x:Arr1) {
			if(x > Largest) {
				Largest = x;
			}
			if(x < Smallest){
				Smallest = x;
			}
		}
		System.out.println("Largest Number : "+Largest);
		System.out.println("Smallest Number : "+Smallest);
		sc.close();
		//BankManagement System
	
		bankaccount BAccounts = new bankaccount("Swapna", 1000.0);
		BAccounts.DisplayBalance();
		BAccounts.Deposit(2000);
		BAccounts.withdraw(500);
		BAccounts.DisplayBalance();
		
		
	}
	
	static class bankaccount {
		public String AccounHolder ;
		public double AccountBalance;
		
		public bankaccount(String name,double intialbalance){
			this.AccounHolder = name;
			
			this.AccountBalance = intialbalance;
		}
	
		public void Deposit(double depositamount){
			if (depositamount >0) {
				AccountBalance += depositamount ;
				System.out.println("Deposited : "+AccountBalance);
			}else {
				System.out.println("invalid amount");
			}
			
		}
		
		public void withdraw(double Withdrawamount) {
			if(Withdrawamount > 0 && Withdrawamount <=  AccountBalance) {
				AccountBalance -= Withdrawamount;
				System.out.println("withdrawn : "+Withdrawamount);
			}else {
				System.out.println("invalid withdrwal amount.");
			}
		}
		
		public void DisplayBalance() {
			System.out.println("Accountholder Name : " +AccounHolder);
			System.out.println("Balance : "+AccountBalance);
		}
	}
}
