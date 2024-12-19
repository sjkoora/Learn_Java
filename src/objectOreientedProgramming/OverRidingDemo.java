package objectOreientedProgramming;

class Bank {
	double roi() {
		return 0;
	}
}

class icici extends Bank {
	double roi() {
		return 10.5;
	}
}

class SBI extends Bank {
	double roi() {
		return 11.5;//overriding method
	}
}

public class OverRidingDemo {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		System.out.println(b.roi());
		
		icici ic= new icici();
		System.out.println(ic.roi());
		
		SBI sb = new SBI();
		System.out.println(sb.roi());
	}

}
