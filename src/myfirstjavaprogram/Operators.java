package myfirstjavaprogram;

public class Operators {

	public static void main(String[] args) {
		//1) Arithmetic Operators= + ,-, *,/,%
		int a=100;
		int b=200;
		int c= a+b;
System.out.println(c);
System.out.println("sum  " +(a+b));
//division=/
//modualar division =% gives u reminder

//2)  Relation /comparision(> >= < <= != ==)
//returns boolean value
//we can use all data types

System.out.println(a>b);
System.out.println(a<=b);
b=20;//change value of b
System.out.println(a<=b);//false
System.out.println(a!=b);//true
System.out.println(a==b);//false/== is used for comparision
boolean results = a>b;
System.out.println(results);

//3)Logical(&&,||,!)
//they always return boolean values
//only works with 2 boolean values
//&& operator will return ture only both are true
//||operator will return only one false when both r false
//! operator gives opposite
 boolean x= true;
 boolean y = false;
 System.out.println(x && y);//
 System.out.println(x||y);//true
 System.out.println(!x);//false
 System.out.println(!y);//true
 
 boolean b2 =10>20;
 boolean b3 = 20>10;
 System.out.println(b2);//false
 System.out.println(b3);//true
 System.out.println(b2 && b3);//false
 System.out.println(b2 || b3);//true
 
 System.out.println((10<20)&&(20>10));//true
 
 
 //** 6conditional/ternary operator)
 
	}

}
