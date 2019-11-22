package observerpattern.extendedclasses;

import observerpattern.classes.Observers;
import observerpattern.classes.Subject;

public class OctalObserver extends Observers{
	
public OctalObserver(Subject subject) {
		
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: "+Integer.toBinaryString(subject.getState()));
		
	}
}
