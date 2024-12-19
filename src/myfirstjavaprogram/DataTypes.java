package myfirstjavaprogram;

public class DataTypes {

	public static void main(String[] args) {
		//Numeric datatypes
		int a=100,b=200;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println("sum of a&b is : " +(a+b));
		
		
		//byte
		byte by = 125;
		System.out.println(by);
		
		//short
		short sh =3244;
		System.out.println(sh);
		
		//long
		long l = 2423234L;//add L/l(literal)at end
		System.out.println(l);
		
		
		//Decimal numbers:float,double

		//Float
		float f = 12.983F;
		System.out.println(f);
		//Double
		double d = 1238.2482787593485790;		
		System.out.println(d);
		
		//char
		char g = 'A';
		System.out.println(g);
		//string
		String name="john";
		System.out.println(name);
		
		//char ch ='ABC';//this is invalid
		//String ch ='ABC';//this is invalid
		//String ch ='A';//this is invalid
		String ch ="A";//this is valid
		
		
	//boolean allows only true /false
		boolean bl = true;
		System.out.println(bl);
		
		//boolean bl="true";//not valid as it is in cotations
		//String bl = true;//not valid as it is bolean not string
		String bln="true";//it is valid as it is in cotations so string
		System.out.println(bln);
	}

}
