package templatemethodpattern.abstractclass;

public abstract class Hoagie {

	public void makeSandwitch() {

		cutBan();

		if (customerWantMeat()) {

			addMeat();
		}
		if (customerWantCheese()) {

			addCheese();
		}
		if (customerWantVegitable()) {

			addVegitable();
		}
		if (customerWantCondiments()) {

			addCondiments();
		}
	}

	private void cutBan() {
		System.out.println("The Hoagie is cut!");
	}

	protected abstract void addMeat();
	protected abstract void addCheese();
	protected abstract void addVegitable();
	protected abstract void addCondiments();

	boolean customerWantCheese() {return true;}
	boolean customerWantMeat() {return true;}
	boolean customerWantVegitable() {return true;}
	boolean customerWantCondiments() {return true;}
	
	public void wrapTheHoagie() {
		System.out.println("Wrap the Hoagie");
	}
}
