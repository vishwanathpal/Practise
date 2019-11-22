package adapterdesignpattern.adapterclass;

import adapterdesignpattern.implementedclasses.Mp4Player;
import adapterdesignpattern.implementedclasses.VlcPlayer;
import adapterdesignpattern.interfaces.AdvanceMediaPlayer;
import adapterdesignpattern.interfaces.MediaPlayer;

public class MediaAdaptor implements MediaPlayer {
	
	AdvanceMediaPlayer advanceMediaPlayer;

	public MediaAdaptor(String audioType) {

		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer = new VlcPlayer();
		}
		
		else if (audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advanceMediaPlayer.playVLC(fileName);
		}
		else if (audioType.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer.playMP4(fileName);
		}
	}
}
