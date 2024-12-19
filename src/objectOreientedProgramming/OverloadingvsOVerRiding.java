package objectOreientedProgramming;

class ABC {
	void m1(int a) {
		System.out.println(a);
	}

	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC {
	void m1(int a)// overriding ,we hv 3 methods-declarion not changed,only with inheretance
	{
		System.out.println(a * a);
	}
	void m2(int b) {
		System.out.println(b*b);
	}
	void m2(int a, int b) //overloading-declararion is changed,with r without inheretance
	{
		System.out.println(a + b);
	}
}

public class OverloadingvsOVerRiding {

	public static void main(String[] args) {
		XYZ xyzobj =new XYZ();
		xyzobj.m1(10);//overriding
		xyzobj.m2(2);//overriding
		xyzobj.m2(20, 50);//overloaded
	}

}
