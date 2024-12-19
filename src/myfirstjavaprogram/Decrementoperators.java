package myfirstjavaprogram;

public class Decrementoperators {

	public static void main(String[] args) {
		// case1
		int a=10;
		a--;//a=a-1;
		System.out.println(a);//9
		
		//case 2 post decrement
		int a1=100;
		int res = a1--;
		System.out.println(res);//100
		System.out.println(a1);//99
		
		//case3 pre decrement
		
		int a11=100;
		int res1 = --a11;
		System.out.println(res1);//99
		System.out.println(a11);//99
	}

}
