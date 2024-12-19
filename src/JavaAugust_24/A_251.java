package JavaAugust_24;

import java.util.ArrayList;

public class A_251 {

	public static void main(String[] args) {
		// ArrayList=a resizable array
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("HotDog");
		food.add("Hamburger");
		food.set(0, "Sushi");
		food.remove(2);
		food.clear();
		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));

		}

	}

}
