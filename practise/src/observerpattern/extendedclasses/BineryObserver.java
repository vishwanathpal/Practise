package observerpattern.extendedclasses;

import observerpattern.classes.Observers;
import observerpattern.classes.Subject;

public class BineryObserver extends Observers{
	
	public BineryObserver(Subject subject) {
		
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: "+Integer.toBinaryString(subject.getState()));
		
	}
}
