package templatemethodpattern;

import templatemethodpattern.abstractclass.Hoagie;
import templatemethodpattern.extendedclass.ItalianHoagie;
import templatemethodpattern.extendedclass.VeggiHoagie;

public class TemplateMethodPatternDemo {

	public static void main(String[] args) {

		Hoagie hoagie = new ItalianHoagie();
		hoagie.makeSandwitch();
		System.out.println("=========");
		hoagie = new VeggiHoagie();
		hoagie.makeSandwitch();
	}
}