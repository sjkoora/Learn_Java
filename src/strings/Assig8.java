package strings;

import java.util.Arrays;

public class Assig8 {

	public static void main(String[] args) {
		// Find Longest Word
		String s = "Java is a versatile programming language";
		String LOngestV = "";
		String a[] = s.split(" ");

		System.out.println(Arrays.toString(a));
		for (String word : a) {
			if (word.length() > LOngestV.length()) {
				LOngestV = word;
			}
		}
		System.out.println("LongWord : " + LOngestV);
	}
}
