package concurrentcollection.concurrentlinkedqueue;

public class ConTask implements Runnable {
	
	Buffer buffer;
	
	public ConTask(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		buffer.get();
	}
}
