package observerpattern.classes;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observers> observer = new ArrayList<Observers>();
	private int state;
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	
	public int getState() {
		return state;
	}


	public void attach(Observers observers) {
		observer.add(observers);
	}
	
	public void deattach(Observers observers) {
		observer.remove(observers);
	}

	private void notifyAllObservers() {
		for(Observers observers : observer) {
			observers.update();
		}
	}
}
