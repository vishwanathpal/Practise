package statepattern.classes;

import statepattern.interfaces.ATMState;

public class NoCash implements ATMState {
	
	ATMMachine atmMachine;

	public NoCash(ATMMachine NewatmMachine) {
		this.atmMachine = NewatmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("We don't have Money");
	}

	@Override
	public void ejectCard() {
		System.out.println("ejectCard():: We don't have Money! You didn't enter card");
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("insertPin(int pinEntered)::We don't have Money");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("requestCash(int cashToWithdraw)::We don't have Money");
	}

}
