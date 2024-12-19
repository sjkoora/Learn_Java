package objectOreientedProgramming;

public class OverloadingMainMethod {
	void main(int x) {
		System.out.println(x);

	}

	void main(String x) {
		System.out.println(x);

	}

	void main(String x, String y) {
		System.out.println(x + y);

	}

	public static void main(String[] args) {

		OverloadingMainMethod ov = new OverloadingMainMethod();
		ov.main(100);
		ov.main("ds");
		ov.main("ds", "sdsd");

	}

}
