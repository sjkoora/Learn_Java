package objectOreientedProgramming;

public class ThisKeyWord {
	int x, y;// instance r class variables -we can access anywhere in the class

	// constructor
	ThisKeyWord(int a, int b)// created a constructor n a,b r local variables nx,y r class variables
	// we can use same name to both variables and use this keyword to differentiate
	// them
	{
		x = a;// this.x=x;
		y = b;
	}

	// Method
	void SetData(int A, int B) {
		x = A;
		y = B;
	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {

		ThisKeyWord th = new ThisKeyWord(1, 2);
		th.SetData(100, 200);
		th.display();

	}

}
