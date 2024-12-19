package objectOreientedProgramming;
class Test{
	int x=100;
	final int y=2;
}
public class FinalKeyWord {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x);
		t.x=200;//we can change value
		System.out.println(t.x);
		
		//final variable
		/*System.out.println(t.y);
		t.y=200;//we cannot change value as we used final word which is fixed
		System.out.println(t.y);*/
	}

}
