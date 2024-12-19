package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
	int AccountNumber;
	String AccountHolderName;
	double Balance;
	ArrayList<String> AccountHolders;

	// constructor to initialize variables
public 	BankAccount(String name, double initialBalance) {
		this.Balance = initialBalance;
		this.AccountHolderName = name;
		//this.AccountNumber = AccountNumber;
	}

//method#1 to add a name to account
	public void setaddAccountHolder(String name) {
		this.AccountHolderName = name;
	}

//Method#2		to get name from account
	public String getAccountHolder() {
		return this.AccountHolderName;
	}

//Method#3 to chk balance
	public void checkBalance() {
		System.out.println("CurrentBalance :" + Balance);
	}

//Method#4 to deposit balance in to account
	public void deposit(double amount) {
		if (amount > 0) {
			Balance += amount;
			System.out.println("Deposited:" + amount);
		} else {
			System.out.println("Invalid Deposit");
		}
	}
}

public class bankAccountProgram {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name for the bank account : ");
		String Name = scanner.nextLine();
		
		System.out.println("Enter the deposit amount: ");
		double DepositAmount = scanner.nextDouble();
		
		//System.out.println("Enter your account number :");
		//int ACcNumber = scanner.nextInt();
		
		BankAccount Acc = new BankAccount(Name,DepositAmount);
		System.out.println("Account created successfully.");
		System.out.println("Account Holder :"+ Acc.getAccountHolder());
		Acc.checkBalance();
		
		System.out.println("Enter the amount to deposit : ");
		double DepositAmount1 = scanner.nextDouble();		
        Acc.deposit(DepositAmount1);
        
        Acc.checkBalance();
        
        scanner.close();
	}

}
