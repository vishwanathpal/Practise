package concurrentcollection.blockingqueue.delyqueue1;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayWorker implements Delayed {
	
	private long duration;
	private String message;
	
	public DelayWorker(long duration, String message) {
		this.duration = System.currentTimeMillis() + duration;
		this.message = message;
	}

	//============override method===================
	@Override
	public int compareTo(Delayed otherDelayed) {

		if(this.duration < ((DelayWorker) otherDelayed).getDuration())
			return -1;
		else if(this.duration > ((DelayWorker) otherDelayed).getDuration())
			return +1;
		return 0;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return unit.convert(duration-System.currentTimeMillis(), TimeUnit.MILLISECONDS);
	}
	
	 @Override
	public String toString() {
		return this.message+ "duration: "+this.duration;
	}

	 //=============getter setter====================
	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
