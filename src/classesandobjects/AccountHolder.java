package classesandobjects;

public class AccountHolder {
	String firstname;
	String lastname;
	int age;
	float accountbalance;
	boolean eligibleForcreditcard;

	public void testEligibilityforCreditCard() {
		if (age>25 && accountbalance>=20000) {
			eligibleForcreditcard = true;
		}
	}
}
