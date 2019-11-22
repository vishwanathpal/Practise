package chainofresponsibility2;

import chainofresponsibility2.classes.Numbers;
import chainofresponsibility2.implementedclasses.AddNumbers;
import chainofresponsibility2.implementedclasses.DividNumber;
import chainofresponsibility2.implementedclasses.MultNumber;
import chainofresponsibility2.implementedclasses.SubtractNumber;
import chainofresponsibility2.interfaces.Chain;

public class ChainOfResponsibilityTest {

	public static void main(String[] args) {

		Chain chanCalculate1 = new AddNumbers();
		Chain chanCalculate2 = new SubtractNumber();
		Chain chanCalculate3 = new MultNumber();
		Chain chanCalculate4 = new DividNumber();
		
		chanCalculate1.setNextChain(chanCalculate2);
		chanCalculate2.setNextChain(chanCalculate3);
		chanCalculate3.setNextChain(chanCalculate4);
		
		Numbers request = new Numbers(4, 5, "sub");
		
		chanCalculate1.calculate(request);
	}

}
//reference: https://www.youtube.com/watch?v=jDX6x8qmjbA