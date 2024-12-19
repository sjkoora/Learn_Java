package objectOreientedProgramming;

class P{
	void display(int a) {
		System.out.println(a);
	}
}

class Ch3 extends P{
	void show(int b) {
		System.out.println(b);
	}
}
class Ch4 extends P{
	void Print(int c) {
		System.out.println(c);
	}
}
public class HierarchyINheritance {

	public static void main(String[] args) {
		Ch3 c1 = new Ch3();
		c1.show(100);

		Ch4 c2 = new Ch4();
		c2.Print(101);
		c2.display(30);
	}

}
