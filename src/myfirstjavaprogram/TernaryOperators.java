package myfirstjavaprogram;

public class TernaryOperators {

	public static void main(String[] args) {
		// var=exp ? result1 :result 2;
		//var=variable
		//exp=experation/comparition
//ex 1
		int a=100,b=200;
		int x=(a>b)? a : b;
		//if the expresion is true a value is assigned n returned
		//if the expression is false b value is assigned n returned
		System.out.println(x);
		
		//ex-2
		int y=(1==1)?100:200;
		System.out.println(y);//200
		
		//ex-3
		int person_age=30;
		String result=(person_age>=18)? "Eligible": "not Eligible";
		System.out.println(result);
	}

}
