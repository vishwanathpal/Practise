package concurrentcollection.concurrentlinkedqueue;

public class ProdTask implements Runnable {
	
	Buffer buffer;
	
	public ProdTask(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		// Putting 3 element by producer thread
		for(int i=1; i<4; i++) {
			buffer.put(i);
		}
	}
}