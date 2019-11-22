package statepattern.classes;

import statepattern.interfaces.ATMState;

public class HasPin implements ATMState {
	
	ATMMachine atmMachine;

	public HasPin(ATMMachine NewatmMachine) {
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
		System.out.println("Already Entered PIN");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		
		if(cashToWithdraw > atmMachine.cashInMachine) {
			System.out.println("Don't have that much cash");
			System.out.println("Card Ejected");
			atmMachine.setAtmState(atmMachine.getNoCardState());
		}
		else {
			System.out.println(cashToWithdraw+" is provided by machine");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			
			System.out.println("Card Ejected");
			atmMachine.setAtmState(atmMachine.getNoCardState());
			
			if(atmMachine.cashInMachine <= 0) {
				atmMachine.setAtmState(atmMachine.getNoCashState());
			}
		}
	}
}
