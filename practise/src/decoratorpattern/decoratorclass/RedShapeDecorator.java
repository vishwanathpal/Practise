package decoratorpattern.decoratorclass;

import decoratorpattern.abstractclasses.ShapeDecorator;
import decoratorpattern.interfaces.Shape;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {

		System.out.println("Border color: Red");
	}
}
