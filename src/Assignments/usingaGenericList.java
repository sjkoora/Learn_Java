package Assignments;

import java.util.ArrayList;

public class usingaGenericList {

	public static void main(String[] args) {
		ArrayList<String> fruits =new ArrayList<>();
fruits.add("a");
fruits.add("b");
fruits.add("o");
System.out.println("Printing in arraylist form :"+fruits);
for(String fruit:fruits) {
	System.out.println(fruit);
}
	}

}
