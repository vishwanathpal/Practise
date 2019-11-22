package bridgepattern.implementedclasses;

import bridgepattern.interfaces.DraAPI;

public class RedCircle implements DraAPI{

	@Override
	public void drawCircle(int redius, int x, int y) {
		System.out.println("Drawing Circle [Color: Red, Redius: "+redius+", x: "+x+", y: "+y+"]");
	}
}
