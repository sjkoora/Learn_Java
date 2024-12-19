package javaControlStatements;

public class whileLOop {

	public static void main(String[] args) {
		// exp-1
		int i =1;   //intilize
		while(i<=10) {     //conditon
		System.out.println(i);   //statements
		i++;    //increment
		}
		//exp-2
		//print hello 10 times
		int j=1;
		while(j<=10) {
			System.out.println("Hello"); 
			j++;
		}
		
		//exp3//print even number 1 to 10
		//2, 4, 6 ,8
		//aproach 1
		int x = 2;
		while(x<=10) {
			System.out.println("x:" +x);  
			x+=2;
			//x=x+2;
		}
		//Approach=2
		int y=1;
		while(y<=10) {
			if(y%2==0) {
			System.out.println("value of y :" +y);  
			}
			y++;
		}
//example-4
//display every number even r odd		
		int z=1;
		while(z<=10) {
			if(z%2==0) {
			System.out.println(z+" -Even");  
			}
			else {
				System.out.println(z+ " -odd");  
			}
			z++;
		}
	
//example-5
	//print numners decending order from 10
	
	int num=10;
	while(num>0) {
		System.out.println(num);  
		num--;
	}
	//example-6--without condition,this will go to infinte loop,we came out using second conition
	
	int r=1;
	while(true) {
		System.out.println("GM");  
		r++;
		if (r==3) {
			break;
		}
	}
	
}
}
