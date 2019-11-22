package commanddesignpattern.implementedclasses;

import commanddesignpattern.interfaces.Command;
import commanddesignpattern.interfaces.ElectronicDevice;

public class TurnTVon implements Command {
	
	ElectronicDevice electronicDevice;

	public TurnTVon(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {

		electronicDevice.on();
	}
}
