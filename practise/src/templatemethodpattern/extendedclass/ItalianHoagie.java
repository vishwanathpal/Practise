package templatemethodpattern.extendedclass;

import templatemethodpattern.abstractclass.Hoagie;

public class ItalianHoagie extends Hoagie{
	
	String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
	String[] cheeseUsed = {"Provolone"};
	String[] vegieUsed = {"Lettuce", "Tomatoas", "Onion", "Sweet Peppers"};
	String[] condimentsUsed = {"Oil", "Vinegar"};

	@Override
	protected void addMeat() {

		System.out.println("Adding the Meat: ");
		
		for(String meat : meatUsed) {
			System.out.println(meat + " ");
		}
	}

	@Override
	protected void addCheese() {

		System.out.println("Adding the Cheese: ");
		
		for(String cheese : cheeseUsed) {
			System.out.println(cheese + " ");
		}
	}

	@Override
	protected void addVegitable() {

		System.out.println("Adding the Vegitable: ");
		
		for(String vegitable : vegieUsed) {
			System.out.println(vegitable + " ");
		}
	}

	@Override
	protected void addCondiments() {

		System.out.println("Adding the Condiments: ");
		
		for(String condiment : condimentsUsed) {
			System.out.println(condiment + " ");
		}
	}
}