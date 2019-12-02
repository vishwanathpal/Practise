package concurrentcollection.blockingqueue.synchronousqueue3;

import java.util.concurrent.BlockingQueue;

public class SynchronousQueConsummer extends Thread{
	
	private BlockingQueue<Integer> queue;

	public SynchronousQueConsummer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
        while (true) {
            try {
 
                Integer number = queue.take();
                Thread.sleep(2000);
                consume(number);
                
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

	private void consume(Integer number) {
        String message = "Consumer [" + getName() + "]: ";
        message += " processed number: " + number;
        System.out.println(message);
    }
}
