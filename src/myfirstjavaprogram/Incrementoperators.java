package myfirstjavaprogram;

public class Incrementoperators {

	public static void main(String[] args) {
		// Increment operators ++
		
		//case1
		int a=10;
		System.out.println(a);
		
		a++; //a=a+1;
		System.out.println(a);//newvalue
		
		//case2-post increment
		int b=10;
		int result =b++;
		System.out.println(result);//we will get only 10 as we stored in another variable
	//because after assignment increment happens
		System.out.println(b);

		 //case 3--pre increment
		int c=10;
		int res=++c;
		System.out.println(res);//11
		System.out.println(c);//11
	}

}
