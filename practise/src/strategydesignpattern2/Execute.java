package strategydesignpattern2;

import strategydesignpattern2.classes.Navigation;

public class Execute {

	public static void main(String[] args) {

		Navigation navigation = new Navigation();
		navigation.navigate();
		//navigation.distance();
	}
}
//reference: https://www.youtube.com/watch?v=GNoqUfPH7LE
//reference: https://github.com/java9s/strategy-pattern-example
