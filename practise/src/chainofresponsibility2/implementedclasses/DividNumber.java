package chainofresponsibility2.implementedclasses;

import chainofresponsibility2.classes.Numbers;
import chainofresponsibility2.interfaces.Chain;

public class DividNumber implements Chain {

	private Chain nextInChain;	

	@Override
	public void setNextChain(Chain nextChain) {

		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {

		if(request.getCalculationWanted() == "div") {
			System.out.println(request.getNumber1()+" / "+request.getNumber2()+ " = " +(request.getNumber1()/request.getNumber2()));
		}
		else {
			System.out.println("Only work for Add, Sub, Multi and Div.");
		}
	}
}
