package strings;

public class Ass5 {

	public static void main(String[] args) {
		// TO Count words in a String
		String s = "java love Selenium and WEbDriver in the morning";
		int Count = 1;
		int length = s.length();
		System.out.println(length);
		for (int i = 0; i < length; i++) {
			if ((s.charAt(i) == ' ' ) && (s.charAt(i + 1) != ' ') ){
				Count++;
			}
		}
		System.out.println("Number of words in a String: " + Count);
	}
}

