package concurrentcollection.blockingqueue.linkedtransferqueue1;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueProducer implements Runnable {
	
	protected TransferQueue<String> transferQue;
	final Random random = new Random();
	
	public LinkedTransferQueueProducer(TransferQueue<String> transferQue) {
		this.transferQue = transferQue;
	}

	@Override
	public void run() {

		while(true) {
			
			try {
				String number = UUID.randomUUID().toString();
				transferQue.transfer(number);
				System.out.println("transfer(): "+number);
				System.out.println("size(): "+transferQue.size());
				//Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
