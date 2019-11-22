package decoratorpattern.implementedclasses;

import decoratorpattern.interfaces.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}
