package objectOreientedProgramming;

public class Account {
	private int accno;
	private String name;
	private double amount;
	/*
	 * void setAccno(int acunNo ) { accno=acunNo; //class variable n local variable
	 * r different //we use this key word when both are same } int getAccno() {
	 * return accno; }
	 */

//using eclipse shotcut we can get setters n getters for all variable
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
