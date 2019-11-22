package flyweightpattern.implementedclass;

import flyweightpattern.interfaces.Shape;

public class Circle implements Shape {
	
	private String color;
	private int x;
	private int y;
	private int redius;
	
	public Circle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}

	@Override
	public void draw() {

		System.out.println("Circle: draw() [Color: "+color+", X: "+x+", Y: "+y+", Redius: "+redius);
	}

}
