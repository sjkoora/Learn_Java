package strings;

public class Assig2 {

	public static void main(String[] args) {
		// remove Special charcters in aString
		String s = "Wel@@come";
		System.out.println("original String: " + s);
		String newS = s.replace("@", "");
		System.out.println("New String: " + newS);
	}

}
