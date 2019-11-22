package commanddesignpattern.implementedclasses;

import java.util.List;

import commanddesignpattern.interfaces.Command;
import commanddesignpattern.interfaces.ElectronicDevice;

public class TurnItAllOff implements Command {
	
	List <ElectronicDevice> theDevices;

	public TurnItAllOff(List<ElectronicDevice> theDevices) {
		this.theDevices = theDevices;
	}

	@Override
	public void execute() {

		for(ElectronicDevice device : theDevices) {
			device.off();
		}
	}
}
