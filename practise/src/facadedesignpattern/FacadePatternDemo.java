package facadedesignpattern;

import facadedesignpattern.classes.ShapeMaker;

public class FacadePatternDemo {

	public static void main(String[] args) {

		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
//reference: https://www.youtube.com/watch?v=TUGjjwk9DZo