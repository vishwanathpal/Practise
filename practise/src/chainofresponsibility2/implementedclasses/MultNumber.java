package chainofresponsibility2.implementedclasses;

import chainofresponsibility2.classes.Numbers;
import chainofresponsibility2.interfaces.Chain;

public class MultNumber implements Chain {

	private Chain nextInChain;	

	@Override
	public void setNextChain(Chain nextChain) {

		this.nextInChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {

		if(request.getCalculationWanted() == "mult") {
			System.out.println(request.getNumber1()+" * "+request.getNumber2()+ " = " +(request.getNumber1()*request.getNumber2()));
		}
		else {
			nextInChain.calculate(request);
		}
	}
}
