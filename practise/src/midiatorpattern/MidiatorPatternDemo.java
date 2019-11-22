package midiatorpattern;

import midiatorpattern.classes.Users;

public class MidiatorPatternDemo {

	public static void main(String[] args) {

		Users robert = new Users("Robert");
		Users john = new Users("John");
		
		robert.sendMessage("Hello John");
		john.sendMessage("HI Robert");
	}
}
