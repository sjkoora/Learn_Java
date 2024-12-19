package JavaAugust_24;

import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {
		String Reverse = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		
		String word = scanner.nextLine();
		System.out.println("Your word is: " + word);
		String lowerCaseWord = word.toLowerCase();
		System.out.println("Lets see weather this word is palindrome");
		
		int length = lowerCaseWord.length();
		for (int i = length - 1; i >= 0; i--) {
			Reverse = Reverse + lowerCaseWord.charAt(i);
		}
		if (lowerCaseWord.equals(Reverse)) {
			System.out.println("This word is Palindrome");}
		else
			{System.out.println("This word is  Not Palindrome");}
		scanner.close();

	}

}
