package commanddesignpattern.implementedclasses;

import commanddesignpattern.interfaces.Command;
import commanddesignpattern.interfaces.ElectronicDevice;

public class TurnTVVolumeUp implements Command {

	ElectronicDevice electronicDevice;

	public TurnTVVolumeUp(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {

		electronicDevice.volumUp();
	}
}
