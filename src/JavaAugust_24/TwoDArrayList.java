package JavaAugust_24;

import java.util.ArrayList;

public class TwoDArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String>bakeryList = new ArrayList();
		bakeryList.add("Pasta");				
		bakeryList.add("garlicbread");		
		bakeryList.add("donuts");
		
		ArrayList<String>ProduceList = new ArrayList();
		ProduceList.add("tomatoes");				
		ProduceList.add("garlic");		
		ProduceList.add("peppers");

		ArrayList<String>drinkList = new ArrayList();
		drinkList.add("soda");				
		drinkList.add("coffee");		
		
		
		//ArrayList<String> groceryList = new ArrayList();
		groceryList.add(bakeryList);				
		groceryList.add(ProduceList);		
		groceryList.add(drinkList);
		
		System.out.println(groceryList);
		
		
		
		
	}

}
