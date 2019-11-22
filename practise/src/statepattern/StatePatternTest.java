package statepattern;

import statepattern.classes.ATMMachine;

public class StatePatternTest {

	public static void main(String[] args) {

		ATMMachine atmMachine = new ATMMachine();
		
		atmMachine.insertCard();
		
		atmMachine.ejectCard();
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1439);
		
		atmMachine.requestCash(2000);
		
		atmMachine.insertCard();
		
		atmMachine.insertPin(1439);	
	}
}
//reference: https://www.youtube.com/watch?v=MGEx35FjBuo