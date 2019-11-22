package chainofresponsibility2.interfaces;

import chainofresponsibility2.classes.Numbers;

public interface Chain {
	
	public void setNextChain(Chain nextChain);
	public void calculate(Numbers request);
}
