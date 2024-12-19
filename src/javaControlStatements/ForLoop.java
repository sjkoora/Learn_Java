package javaControlStatements;

public class ForLoop {

	public static void main(String[] args) {
		// ex-1
		//print numbers 1-10
		//int i;
		for(int i=1;i<=10;i++) {
			System.out.println(i);  
		}
		
		//ex-2 -print even numbers 1-10
		for(int j=2;j<=10;j+=2) {
			System.out.println("evn numbers "+j);  
		}
		
		//ex-3 print even or odd 1-10
		for(int z=1;z<=10;z++) {
			if (z%2==0) {
				System.out.println(z +" Is even");  
			}
			else {
				System.out.println(z+" is odd");  
			}
		}
		
		//ex-4 1 to 10 in decending order
		for(int x=10;x>0;x--) {
			System.out.println(x);  
		}

	}

}
