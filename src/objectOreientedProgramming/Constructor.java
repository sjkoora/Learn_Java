package objectOreientedProgramming;

public class Constructor {
	int x, y;

	Constructor() {// default constructor
		x = 100;
		y = 200;
	}

	Constructor(int a, int b) {// parameterized constructor
		x = a;
		y = b;
	}

	void sum() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		Constructor cv = new Constructor();// invoke default constructor
		Constructor cv1 = new Constructor(12, 23);// invoke parameterized constructor
		cv.sum();
		cv1.sum();

	}

}
