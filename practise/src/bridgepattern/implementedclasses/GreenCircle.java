package bridgepattern.implementedclasses;

import bridgepattern.interfaces.DraAPI;

public class GreenCircle implements DraAPI {

	@Override
	public void drawCircle(int redius, int x, int y) {
		System.out.println("Drawing Circle [Color: Green, Redius: "+redius+", x: "+x+", y: "+y+"]");

	}

}
