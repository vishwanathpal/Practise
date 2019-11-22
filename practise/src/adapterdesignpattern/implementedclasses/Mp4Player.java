package adapterdesignpattern.implementedclasses;

import adapterdesignpattern.interfaces.AdvanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVLC(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMP4(String fileName) {
		System.out.println("Playing MP4 file: "+fileName);

	}

}
