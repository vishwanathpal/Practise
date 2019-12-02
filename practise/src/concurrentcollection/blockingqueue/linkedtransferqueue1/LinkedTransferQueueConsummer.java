package concurrentcollection.blockingqueue.linkedtransferqueue1;

import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueConsummer implements Runnable {
	
	protected TransferQueue<String> transferQue;
	
	public LinkedTransferQueueConsummer(TransferQueue<String> transferQue) {
		this.transferQue = transferQue;
	}

	@Override
	public void run() {

		while (true) {
			try {
				String data = transferQue.take();
				System.out.println(Thread.currentThread().getName()+ " take(): " + data);
				System.out.println("size()C: "+transferQue.size());
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
