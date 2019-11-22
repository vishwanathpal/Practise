package commanddesignpattern.implementedclasses;

import commanddesignpattern.interfaces.ElectronicDevice;

public class Television implements ElectronicDevice {

	private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("TV is ON");
	}

	@Override
	public void off() {
		System.out.println("TV is OFF");
	}

	@Override
	public void volumUp() {

		volume++;
		System.out.println("TV Volume at: "+volume);
	}

	@Override
	public void VolumDown() {

		volume--;
		System.out.println("TV Volume at: "+volume);
	}

}
