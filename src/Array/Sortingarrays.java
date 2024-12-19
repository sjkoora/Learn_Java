package Array;

import java.util.Arrays;

public class Sortingarrays {

	public static void main(String[] args) {
		// sorting elements in arrays
		// it can be number or string arrays
		int[] a = { 1, 99,43, 22,66, 88, 556 };
		System.out.println("Print original before sorting");
		System.out.println(Arrays.toString(a));
		//use above syso instead of for loop
//		for (int x : a) {
//			System.out.println(x);
//		}
		
		Arrays.sort(a);
		System.out.println("Print original After sorting");
		System.out.println(Arrays.toString(a));
	}

}
