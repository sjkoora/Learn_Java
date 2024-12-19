package classesandobjects;

public class Accountholderobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		tom.firstname = "Tom";
		tom.lastname = "Smith";
		tom.age = 21;
		tom.accountbalance = 10000;
		tom.testEligibilityforCreditCard();
		System.out.println("Is Tom Eligible for Credit Card : " +tom.eligibleForcreditcard);
	}

}
