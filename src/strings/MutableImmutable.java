package strings;

import java.util.Arrays;

public class MutableImmutable {

	public static void main(String[] args) {

		// mutable-to change
		int a[] = { 100, 23, 43, 56, 78 };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

//immutable-strings are immutable we cannot change orginal value 
		String s = new String("welcome ");
		System.out.println(s);
		s.concat("tojava");
		String concateString =s.concat("tojava");
    System.out.println("before: "+s);// welcome we could not concate original value as we hv to store in another string
    System.out.println("After :"+concateString);
    
	}

}
