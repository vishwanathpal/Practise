package strategydesignpattern.implemtedclasses;

import strategydesignpattern.interfaces.Strategy;

public class OperationSubstraction implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1-num2;
	}

}
