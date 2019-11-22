package statepattern.classes;

import statepattern.interfaces.ATMState;

public class HasCard implements ATMState {
	
	ATMMachine atmMachine;

	public HasCard(ATMMachine NewatmMachine) {
		this.atmMachine = NewatmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("you can't insert more than one cart at a time");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected");
		atmMachine.setAtmState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		
		if(pinEntered == 1439) {
			System.out.println("Correct PIN entered");
			atmMachine.correctPinEntered = true;
			atmMachine.setAtmState(atmMachine.getHasPin());
		}
		else {
			System.out.println("Wrong! PIN entered");
			atmMachine.correctPinEntered = false;
			System.out.println("Card Ejected");
			atmMachine.setAtmState(atmMachine.getNoCardState());
		}
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("Enter card first");
	}

}
