package strategydesignpattern;

import strategydesignpattern.classes.Context;
import strategydesignpattern.implemtedclasses.OperationAdd;
import strategydesignpattern.implemtedclasses.OperationMultiply;
import strategydesignpattern.implemtedclasses.OperationSubstraction;

public class StrategyDesignPatternDemo {

	public static void main(String[] args) {

		Context context = new Context(new OperationAdd());
		System.out.println("10+5= "+context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubstraction());
		System.out.println("10-5= "+context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10x5= "+context.executeStrategy(10, 5));
	}
}
