package statepattern.classes;

import statepattern.interfaces.ATMState;

public class NoCard implements ATMState {
	
	ATMMachine atmMachine;

	public NoCard(ATMMachine NewatmMachine) {
		this.atmMachine = NewatmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Please enter ATM PIN");
		atmMachine.setAtmState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() {
		System.out.println("Please enter Card first");
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("Please enter Card first");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("Please enter Card first");

	}

}
