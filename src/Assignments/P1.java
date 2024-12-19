package Assignments;

public class P1 {

	public static void main(String[] args) {
		// interchanging values 
		int a = 10;
		int b = 15;
		System.out.println("Befor swapping 1.." +a+ " "+b);
		//logic 1
		//temp variable
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping 1.." +a+ " "+b);
		
		//logic 2 using + and - operators
		int A=10,B=20;
		System.out.println("Before swapping 2.." +A+ " "+B);
		A=A+B;//10+20=30
		B=A-B;//30-20=10
		A=A-B;//30-10=20
		System.out.println("After swapping 2.." +A+ " "+B);
		
		
		//Logic 3 using *and / operators where vsribles shld not be zero
		
		int x=100,y=2;
		System.out.println("Before swapping 3.." +x+ " "+y);
		x=x*y;//100*2=200
		y=x/y;//200/2=100
		x=x/y;//200/100=2
		System.out.println("After swapping 3.." +x+ " "+y);
		
		//logic 4 bitwise XOR operator(^)
		int i=10,j=20;
		System.out.println("Before swapping 4.." +i+ " "+j);
		//values will be converted in to binary format
		//10=1010
		//20=10100
		//i^j=11110-binary format of data
		//binary to decimal is 11110=30
	i=	i^j;//10^20=30
	j=	i^j;//30^20=10
	i= i^j;//30^10=20
	System.out.println("After swapping 4.." +i+ " "+j);
	
	
	//logic -5
int 	M=10,n=5;
System.out.println("Before swapping 5.." +M+ " "+n);
//b=a+b-(a=b)-excution starts from right to left
n=M+n-(M=n);
System.out.println("After swapping 5.." +M+ " "+n);
	}

}
