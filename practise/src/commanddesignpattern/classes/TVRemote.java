package commanddesignpattern.classes;

import commanddesignpattern.implementedclasses.Television;
import commanddesignpattern.interfaces.ElectronicDevice;

public class TVRemote {
	
	public static ElectronicDevice getDevice() {
		return new Television();
	}
}
