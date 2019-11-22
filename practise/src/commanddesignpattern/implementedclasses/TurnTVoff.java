package commanddesignpattern.implementedclasses;

import commanddesignpattern.interfaces.Command;
import commanddesignpattern.interfaces.ElectronicDevice;

public class TurnTVoff implements Command {

	ElectronicDevice electronicDevice;

	public TurnTVoff(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {

		electronicDevice.off();
	}

}
