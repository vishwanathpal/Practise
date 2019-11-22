package commanddesignpattern.implementedclasses;

import commanddesignpattern.interfaces.ElectronicDevice;

public class Radio implements ElectronicDevice {

private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("Radio is ON");
	}

	@Override
	public void off() {
		System.out.println("Radio is OFF");
	}

	@Override
	public void volumUp() {

		volume++;
		System.out.println("Radio Volume at: "+volume);
	}

	@Override
	public void VolumDown() {

		volume--;
		System.out.println("Radio Volume at: "+volume);
	}

}
