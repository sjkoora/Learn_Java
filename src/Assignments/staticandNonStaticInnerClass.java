package Assignments;

class C1 {
	String Message = "Hello World";

	class inner {
		void display() {
			System.out.println(Message);
		}
	}

	static class StaticInnerClass {
		void display() {
			System.out.println("Hello from inner class");
		}
	}

}

	public class staticandNonStaticInnerClass {

		public static void main(String[] args) {
			C1 outer = new C1();
			C1.inner inner = outer.new inner();
			inner.display();

			C1.StaticInnerClass ST = new C1.StaticInnerClass();
			ST.display();
		}

	}

