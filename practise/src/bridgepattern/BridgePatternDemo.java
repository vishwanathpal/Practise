package bridgepattern;

import bridgepattern.abstractclasses.Shape;
import bridgepattern.extendedclasses.Circle;
import bridgepattern.implementedclasses.GreenCircle;
import bridgepattern.implementedclasses.RedCircle;

public class BridgePatternDemo {

	public static void main(String[] args) {

		Shape redCircle = new Circle(new RedCircle(),100,100,10);
		Shape greenCircle = new Circle(new GreenCircle(),100,100,10);
		
		redCircle.draw();
		greenCircle.draw();
	}
}
//reference: https://www.youtube.com/watch?v=iR5Or0TjGwA
