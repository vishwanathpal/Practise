package decoratorpattern.decoratorclass;

import decoratorpattern.abstractclasses.ShapeDecorator;
import decoratorpattern.interfaces.Shape;

public class ShadowShapeDecorator extends ShapeDecorator{

	public ShadowShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
		setShadow(decoratedShape);
	}
	private void setShadow(Shape decoratedShape) {

		System.out.println("Border color: Red");
	}
	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border type: 3D");
		 
	}

}
