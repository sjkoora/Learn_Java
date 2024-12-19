package javaControlStatements;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;//jumping to increment 
			}
			System.out.println(i);  
		}
		
		//ex-2
		for(int j=1;j<=10;j++) {
			if(j==3 || j==5) {
				continue;//jumping to increment 
			}
			System.out.println(j);  
		}
			}

	}


