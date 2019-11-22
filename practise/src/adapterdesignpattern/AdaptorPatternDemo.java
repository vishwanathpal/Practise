package adapterdesignpattern;

import adapterdesignpattern.implementedclasses.AudioPlayer;

public class AdaptorPatternDemo {

	public static void main(String[] args) {

		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "Nirvana.mp3");
		audioPlayer.play("mp4", "Matelica.mp4");
		audioPlayer.play("vlc", "KesyAnimal.vlc");
		audioPlayer.play("avi", "sord.avi");
	}
}
//reference: https://www.youtube.com/watch?v=HsI9Ck4gvPw