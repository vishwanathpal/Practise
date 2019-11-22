package templatemethodpattern.extendedclass;

import templatemethodpattern.abstractclass.Hoagie;

public class VeggiHoagie extends Hoagie{
	
	String[] vegieUsed = {"Lettuce", "Tomatoas", "Onion", "Sweet Peppers"};
	String[] condimentsUsed = {"Oil", "Vinegar"};

	boolean customerWantCheese() {return false;}
	boolean customerWantMeat() {return false;}
	
	@Override
	protected void addMeat() {}

	@Override
	protected void addCheese() {}

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
