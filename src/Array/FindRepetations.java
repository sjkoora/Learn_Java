package Array;

import java.util.Scanner;

public class FindRepetations {

	public static void main(String[] args) {
		// number of repetations
	int []a = {1,3,5,6,7,8,8,6,9}	;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a  number : ");
	int num = sc.nextInt();
	int count=0;
	for(int x:a) {
		if(x==num) {
			count++;
		}
	}
	System.out.println(count);

	}

}
