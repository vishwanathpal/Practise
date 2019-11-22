package commanddesignpattern.implementedclasses;

import commanddesignpattern.interfaces.Command;
import commanddesignpattern.interfaces.ElectronicDevice;

public class TurnTVVolumeDown implements Command {

	ElectronicDevice electronicDevice;

	public TurnTVVolumeDown(ElectronicDevice electronicDevice) {
		this.electronicDevice = electronicDevice;
	}

	@Override
	public void execute() {

		electronicDevice.VolumDown();
	}
}
