package proxypattern;

import proxypattern.implementedclasses.ProxyImage;
import proxypattern.interfaces.Image;

public class ProxyPatternDemo {

	public static void main(String[] args) {

		Image image = new ProxyImage("test_10g.jpg");
		image.display();
		System.out.println("");
		image.display();
	}

}
//reference: https://www.youtube.com/watch?v=db9HiagrQkc
