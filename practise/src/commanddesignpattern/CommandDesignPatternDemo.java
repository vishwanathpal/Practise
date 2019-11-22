package commanddesignpattern;

import java.util.ArrayList;
import java.util.List;

import commanddesignpattern.classes.DeviceButton;
import commanddesignpattern.classes.TVRemote;
import commanddesignpattern.implementedclasses.Radio;
import commanddesignpattern.implementedclasses.Television;
import commanddesignpattern.implementedclasses.TurnItAllOff;
import commanddesignpattern.implementedclasses.TurnTVVolumeDown;
import commanddesignpattern.implementedclasses.TurnTVVolumeUp;
import commanddesignpattern.implementedclasses.TurnTVoff;
import commanddesignpattern.implementedclasses.TurnTVon;
import commanddesignpattern.interfaces.ElectronicDevice;

public class CommandDesignPatternDemo {

	public static void main(String[] args) {

		ElectronicDevice newDevice = TVRemote.getDevice();
		//turn the TV ON
		TurnTVon onCommand1 = new TurnTVon(newDevice);		
		DeviceButton onPress = new DeviceButton(onCommand1); 
		onPress.press();
		
		//turn the TV OFF
		TurnTVoff onCommand2 = new TurnTVoff(newDevice); 
		onPress = new DeviceButton(onCommand2); 
		onPress.press();
		
		//turn the TV volume up
		TurnTVVolumeUp volUpCommand = new TurnTVVolumeUp(newDevice);
		onPress = new DeviceButton(volUpCommand);
		onPress.press();
		onPress.press();
		onPress.press();
		
		//turn the TV volume down
		TurnTVVolumeDown volDownCommand = new TurnTVVolumeDown(newDevice);
		onPress = new DeviceButton(volDownCommand);
		onPress.press();
		onPress.press();
		onPress.press();
		onPress.press();
		
		//turn all the device off (TV & Radio)
		Television theTV = new Television();
		Radio theRadio = new Radio();
		
		List<ElectronicDevice> allDevice = new ArrayList<ElectronicDevice>();
		allDevice.add(theTV);
		allDevice.add(theRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevice);
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		turnThemOff.press();
		
	}
}
//reference: https://www.youtube.com/watch?v=7Pj5kAhVBlg