package strings;

public class ReverseString {

	public static void main(String[] args) {
		// there is no direct method available for revese string in java
		// u hv to write logic
		// we hvto capture last char and concate to exixting variable
		// we use index /length of string to zero
		// find length of string
		// how to extract last char -using charAt(i)
		//approach 1
		String s = "Welcome";
		String reverse=" ";
		System.out.println(s.length());
		for (int i = s.length() - 1; (i >= 0); i--) {

			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
		
		//approach-2 without using string methods
		 //convert string to char array
		//then read from end
		String s1 = "Selenium";
		String rev =" ";
		char a[]= s1.toCharArray();
		System.out.println(a);
		for(int i=a.length-1;i>=0;i--) {
			//System.out.println(a[i]);
			rev=rev+a[i];
			
		}
		System.out.println(rev);
		
		//approach-3
		//using stringbuffer class
		StringBuffer s2= new StringBuffer("Morning");
		System.out.println("Reverse String = "+s2.reverse());
		
		//approach4
		StringBuilder s3 = new StringBuilder("HappyDay");
		System.out.println("Reverse ="+s3.reverse());
	}

}
