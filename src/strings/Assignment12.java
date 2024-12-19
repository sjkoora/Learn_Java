package strings;

import java.util.Arrays;

public class Assignment12 {

	public static void main(String[] args) {
		String One = "mad";
String two = "dad";
char O1[]= One.toCharArray();
char O2[]= two.toCharArray();
Arrays.sort(O1);
Arrays.sort(O2);
Boolean Answer =Arrays.equals(O1, O2);
System.out.println(Answer);
	}

}
