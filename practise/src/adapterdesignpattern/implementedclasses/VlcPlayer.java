package adapterdesignpattern.implementedclasses;

import adapterdesignpattern.interfaces.AdvanceMediaPlayer;

public class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		System.out.println("Playing VLC file: "+fileName);

	}

	@Override
	public void playMP4(String fileName) {
		// TODO Auto-generated method stub

	}

}
