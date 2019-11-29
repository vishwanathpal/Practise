package concurrentcollection.blockingqueue.linkedblockingqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerLBQ implements Runnable{
	
	private BlockingQueue<Integer> queue;
	 
    public ProducerLBQ (BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

	@Override
	public void run() {

		try {
			
			for(int i=0; i <= 50; i++) {
				Integer integer = product();
				queue.put(integer);
				System.out.println("PRODUCER: created " + integer);
			}

			queue.put(-1);       // indicates end of producing
            System.out.println("PRODUCER: STOPPED.");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	//to generate sample product
	private Integer product() {

		Random random = new Random();
		Integer integer = random.nextInt(100);
		
		 try {
	            Thread.sleep(random.nextInt(1000));
	        } catch (InterruptedException ie) { ie.printStackTrace(); }
		return integer;
	}
}
