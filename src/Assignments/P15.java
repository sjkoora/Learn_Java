package Assignments;

public class P15 {

	public static void main(String[] args) {
		// To find even and odd in an array
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int Even = 0;
		int Odd = 0;
		System.out.println("even numbers in the array ...");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0)
//				;
//			System.out.println(a[i]);
//
//		}
//		System.out.println("odd numbers in the array ...");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 != 0)
//				;
//			System.out.println(a[i]);
		
		
		
		//enhanced for loop
		for(int num :a) {
			if(num%2==0)
				System.out.println(num);

		}
		System.out.println("odd numbers in the array ...");
		for(int num :a) {
			if(num%2!=0)
				System.out.println(num);

		}

	}

}
