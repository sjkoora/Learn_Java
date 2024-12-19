package strings;

public class Ass4 {

	public static void main(String[] args) {
		// count the occurrence of characters in a string
		String s = "wellcomeee";
		int l = s.length();
		int CountAfter = s.replace("l", "").length();
		int Count = l - CountAfter;

		System.out.println(Count);

//System.out.println(a);

	}

}
