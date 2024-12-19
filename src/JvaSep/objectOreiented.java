package JvaSep;

class scooter {

	String sytle = "one";
	String color = "red";

	void speed() {
		System.out.println("Max speed");
	}
}

public class objectOreiented {

	public static void main(String[] args) {
		car1 mycar = new car1();
		mycar.drive();
		System.out.println(mycar.model);
		
		scooter myscooter = new scooter();
		System.out.println(myscooter.color);
		
	}
}
