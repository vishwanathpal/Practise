package statepattern.classes;

import statepattern.interfaces.ATMState;

//this is context class which maintain state of the object (ATM Machine)
public class ATMMachine {
	
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	ATMState atmState;
	
	int cashInMachine = 2000;
	boolean correctPinEntered = false;
	
	public ATMMachine() {
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		
		atmState = noCard;
		
		if(cashInMachine < 0) {
			atmState = atmOutOfMoney;
		}
	}

	public ATMState getAtmState() {
		return atmState;
	}

	public void setAtmState(ATMState atmState) {
		this.atmState = atmState;
	}

	public void setCashInMachine(int cashInMachine) {
		this.cashInMachine = cashInMachine;
	}
	
	public void insertCard() {
		atmState.insertCard();
	}
	
	public void ejectCard() {
		atmState.ejectCard();
	}
	
	public void requestCash(int cashToWithdraw) {
		atmState.requestCash(cashToWithdraw);
	}
	
	public void insertPin(int pinEntered) {
		atmState.insertPin(pinEntered);
	}
	
	public ATMState getYesCardState() {return hasCard;}
	public ATMState getNoCardState() {return noCard;}
	public ATMState getHasPin() {return hasCorrectPin;}
	public ATMState getNoCashState() {return atmOutOfMoney;}
}
