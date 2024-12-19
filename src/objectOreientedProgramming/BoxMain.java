package objectOreientedProgramming;

public class BoxMain {

	public static void main(String[] args) {
		Box B = new Box();
		//no parameters it will invoke default constructor
	System.out.println(	B.volume());//0
	//2
	Box A = new Box(10.5,23.5,45.6);
	System.out.println(	A.volume());
	
	//3
	
	
		Box c = new Box(5) ;
		System.out.println(	c.volume());
		}
}
