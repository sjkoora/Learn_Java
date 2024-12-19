package Assignments;

class Car {//another class
	String brand;
	int speed;

	Car(String brand, int speed) {//constructor with same name
		this.brand=brand;//using this key word to diff between class n local variables
		this.speed=speed;
	}
	void display(){//creating a method in new class
		System.out.println("BrandName :"+brand);
		System.out.println("Speed :"+speed);
	}

	}

public class Demonstratingclassandobject {

	public static void main(String[] args) {
		
Car c1 = new Car("Toyota",120);//creating object for class Car
Car c2 = new Car("Honda",144);
c1.display();
c2.display();
	}

}
