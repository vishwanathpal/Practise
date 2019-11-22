package adapterdesignpattern.implementedclasses;

import adapterdesignpattern.adapterclass.MediaAdaptor;
import adapterdesignpattern.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	
	MediaAdaptor mediaAdaptor;

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing MP3 file: "+fileName);
		}
		else if ((audioType.equalsIgnoreCase("vlc")) || (audioType.equalsIgnoreCase("mp4"))) {
		
			mediaAdaptor = new MediaAdaptor(audioType);
			mediaAdaptor.play(audioType, fileName);
		}
		else {
			System.out.println("Invalid media adapter["+ audioType +"]file not supported");
		}

	}

}
