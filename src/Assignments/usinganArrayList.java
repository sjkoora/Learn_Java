package Assignments;

import java.util.ArrayList;

public class usinganArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Sw");
		names.add("dd");
		names.add("sss");
		System.out.println("Names : "+names);
		for(String name :names) {
			System.out.println(name);
		}

	}

}
