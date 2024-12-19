package objectOreientedProgramming;

public class StaticMain {

	public static void main(String[] args) {
		
		//STATIC
		//when u separate main method it will throw error 
				System.out.println(StaticDemo.A);//we hv to specify classname.name
				StaticDemo.m1();
				
				//NON STATIC
			/*	System.out.println(B);//cannot access it without creating object
				m2();//cannot access it without creating object*/
				StaticDemo sd = new StaticDemo();
				System.out.println(sd.B);
				sd.m2();
				sd.m();
	}

}
