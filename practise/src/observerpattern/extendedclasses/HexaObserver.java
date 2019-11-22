package observerpattern.extendedclasses;

import observerpattern.classes.Observers;
import observerpattern.classes.Subject;

public class HexaObserver extends Observers{

public HexaObserver(Subject subject) {
		
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hexa String: "+Integer.toBinaryString(subject.getState()));
		
	}
}
