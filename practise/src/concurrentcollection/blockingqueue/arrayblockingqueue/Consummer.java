package concurrentcollection.blockingqueue.arrayblockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consummer implements Runnable {
	
	private BlockingQueue<Message> queue;

	public Consummer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		Message msg;
		
		try {
		while((msg = queue.take()).getMsg() != "exist") {
			Thread.sleep(10);
			System.out.println("Consummer: "+msg.getMsg());
		}	
		} catch(InterruptedException e) {
            e.printStackTrace();
        }
	}
}
