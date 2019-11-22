package decoratorpattern.implementedclasses;

import decoratorpattern.interfaces.Shape;

public class Sqaure implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Sqaure");
	}
}
