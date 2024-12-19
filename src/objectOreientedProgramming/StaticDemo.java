package objectOreientedProgramming;

public class StaticDemo {
	
	static int A= 10;//static variable
	int B =20;//non static variable
	
	static void m1()//static
{
		System.out.println("this is static metod");
	}
	 void m2() //non static method
	 
	 {
		System.out.println("this is non static metod");
	}
	 
	 void m() //nonstatic method we can acess everyt  thing
	 {
		 System.out.println(A);
		 System.out.println(B);
		 m1();
		 m2();
	 }
	 //staic methods can directly acess static v nad method without creting any object
/*public static void main(String[] args) {
		//STATIC
		System.out.println(A);
		m1();
		
		//NON STATIC
	/*	System.out.println(B);//cannot access it without creating object
		m2();//cannot access it without creating object
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.B);
		sd.m2();
		sd.m();
		
		

	}*/

}
