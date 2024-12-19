package Array;

import java.util.Arrays;
import java.util.Scanner;

public class readingNwrintingInToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[ ]= new int[5];
		
Scanner sc =new Scanner(System.in);
for(int i=0;i<a.length;i++) {
	System.out.println("Enter a number for the positon :"+i+" :");
	a[i]=sc.nextInt();
}
System.out.println(Arrays.toString(a));
	}

}
