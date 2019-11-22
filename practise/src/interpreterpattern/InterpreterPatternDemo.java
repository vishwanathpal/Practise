package interpreterpattern;

import interpreterpattern.implementedclasses.AndExpression;
import interpreterpattern.implementedclasses.OrExpression;
import interpreterpattern.implementedclasses.TerminalExpression;
import interpreterpattern.interfaces.Expression;

public class InterpreterPatternDemo {
	
	public static Expression getMaleExpression() {
		Expression john = new TerminalExpression("John");
		Expression robert = new TerminalExpression("Robert");
		return new OrExpression(john, robert);
	}
	
	public static Expression getMarriedWomenExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {

		Expression isMale = getMaleExpression();
		Expression isMarried = getMarriedWomenExpression();
		System.out.println("John is Male? "+isMale.interpret("John"));
		System.out.println("Julie is a Married Women? "+isMarried.interpret("Married Julie"));
	}
}
//reference: https://www.youtube.com/watch?v=MKsnfKV5WxM
