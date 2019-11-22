package bridgepattern.extendedclasses;

import bridgepattern.abstractclasses.Shape;
import bridgepattern.interfaces.DraAPI;

public class Circle extends Shape{
	
	private int x, y, redius;

	public Circle(DraAPI draApi, int x, int y, int redius) {
		super(draApi);
		this.x = x;
		this.y = y;
		this.redius = redius;
	}

	@Override
	public void draw() {
		draApi.drawCircle(redius, x, y);
	}
}
