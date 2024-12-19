package Assignments;

class Neg extends Exception{
	public Neg(String message) {
		super(message);
	}
}
public class customException {

	public static void main(String[] args) throws Neg {
		int A[]= {12,-3,-89,99,54};
		try {
		for(int a:A) {
			if(a<0) {
				throw new Neg("Negtive number found"+a);
			}
			System.out.println("Number  : "+a);
		}

	}catch(Neg e) {
		System.out.println("Error: "+e.getMessage());
	}finally {
		System.out.println("Processing Completed.");
	}
	}
}

