package concurrentcollection.blockingqueue.delayqueue2;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayElement implements Delayed {
	
	private String element;
	private long expiryTime;
	
	public DelayElement(String element, long delay) {
		this.element = element;
		this.expiryTime = System.currentTimeMillis() + delay;
	}

	@Override
	public int compareTo(Delayed o) {
		if(this.expiryTime < ((DelayElement)o).expiryTime)
			return -1;
		else if (this.expiryTime < ((DelayElement)o).expiryTime)
			return +1;
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long diff = expiryTime - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	@Override
	public String toString() {
		return element.toString()+ ": "+expiryTime;
	}
}
