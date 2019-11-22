package decoratorpattern;

import decoratorpattern.decoratorclass.RedShapeDecorator;
import decoratorpattern.decoratorclass.ShadowShapeDecorator;
import decoratorpattern.implementedclasses.Circle;
import decoratorpattern.implementedclasses.Rectangle;
import decoratorpattern.implementedclasses.Sqaure;
import decoratorpattern.interfaces.Shape;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		Shape sqaure = new Sqaure();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		Shape sqaureBorderEffect = new ShadowShapeDecorator(new Sqaure());
		
		System.out.println("Circle with no border");
		circle.draw();
		System.out.println("Rectangle with no border");
		rectangle.draw();
		System.out.println("Sqaure with no effect");
		sqaure.draw();		
		
		System.out.println("\nCircle with red border");
		redCircle.draw();
		System.out.println("\nRectangle with red border");
		redRectangle.draw();
		System.out.println("\nSquare with border effect");
		sqaureBorderEffect.draw();
		
	}

}
