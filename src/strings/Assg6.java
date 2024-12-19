package strings;

public class Assg6 {

	public static void main(String[] args) {
		// Count number of vowels
		String s = "Java Programming";
		int vowelCount = 0;
		int ConCount = 0;
		int l = s.length();
		System.out.println(l);
		String st= s.toLowerCase();
		System.out.println(st);
		for (int i = 0; i < l; i++) {
			char ch = st.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;

			} else if (Character.isLetter(ch)) {
				ConCount++;
			}

		}
		System.out.println("VowelCount : " + vowelCount);
		System.out.println("ConstantCount : " + ConCount);
	}

}
