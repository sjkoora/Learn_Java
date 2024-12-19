package strings;

public class Assignments {

	public static void main(String[] args) {
		// find a String a palindrome
		String s = "Madam";
		String ReveseString = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			ReveseString = ReveseString + s.charAt(i);
		}
		System.out.println(ReveseString);
		if (s.equalsIgnoreCase( ReveseString)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome");
		}
	}

}
