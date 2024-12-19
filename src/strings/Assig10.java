package strings;

import java.util.ArrayList;

public class Assig10 {

	public static void main(String[] args) {
		// Sort even n odd of given string
		String input = "45,87,23,4,0,44,32,12,9,87,6";
		ArrayList<Integer> evenNumbers = new ArrayList<>();
		ArrayList<Integer> OddNumbers = new ArrayList<>();
		System.out.println("Original Input :" + input);
		
		String[] ch = input.split(",");
		
		int l = ch.length;

		System.out.println(l);
		for (String i: ch) {
			int num = Integer.parseInt(i.trim());
			if (num % 2 == 0) {
				evenNumbers.add(num);
			} else {
				OddNumbers.add(num);
			}

		}
		System.out.println("Even Numbers :"+evenNumbers);
		System.out.println("Odd Numbers :"+OddNumbers);

	}

}
