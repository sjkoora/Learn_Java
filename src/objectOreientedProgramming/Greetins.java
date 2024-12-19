package objectOreientedProgramming;

public class Greetins {
	
//1.No parameters/arguments  no retturn value
	//we hv to specify void as no return
	void m1(){
		System.out.println("Hello");
	}
//2.Noparameters but return value
	String m2(){
		return("Hello How are you?");
	}	
//3.takes parameters but no return value
		 void m3(String name){
			 System.out.println("Hello "+name);
	}
//4.takes parameters and return values
		 String m4(String name){
			 return("Hello "+name);
	} 
}
