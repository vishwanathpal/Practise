	package midiatorpattern.classes;

import java.util.Date;

public class MidiatorChatRoom {
	
	public static void showMessage(Users users, String message) {
		System.out.println(new Date().toString()+ " ["+users.getName()+"] : "+message);
		
	}
}
//reference: https://www.youtube.com/watch?v=YU8fNerur8Q
