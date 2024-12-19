package objectOreientedProgramming;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetins g = new Greetins();
		g.m1();// 1
		String s =g.m2();//we need to cature value in avariable as it is returning
		System.out.println(s);//2
		g.m3("swapna");//no revalue so no variable needed
		String s2=g.m4("Koora");
		System.out.println(s2);
	}

}
