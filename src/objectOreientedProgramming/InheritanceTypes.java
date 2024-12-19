package objectOreientedProgramming;

class M {
	int a = 10;
	int b;
	void display() {
		System.out.println("value of parent"+a);
		
	}

}

class child extends M {
	int y = 20;
	void show() {
		System.out.println("value of child "+y);
	}
}

class child1 extends child {//multilevel in heretance
	int z = 5;
	void Print() {
		System.out.println("value of child1 "+z);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		child chobj =new child();
		System.out.println("Value of a : "+chobj.a);
		System.out.println("Value of y : "+chobj.y);
		chobj.display();
		chobj.show();
		//multilevel inheritance
		child1 Cobj = new child1();
		//Cobj.b=100;//we can assign data to variable
		System.out.println(Cobj.b=100);
		Cobj.display();
		Cobj.show();
		Cobj.Print();
		
	}

}
