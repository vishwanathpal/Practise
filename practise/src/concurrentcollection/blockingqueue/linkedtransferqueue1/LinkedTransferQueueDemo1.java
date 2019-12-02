package concurrentcollection.blockingqueue.linkedtransferqueue1;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueDemo1 {

	public static void main(String[] args) {

		TransferQueue<String> tQue = new LinkedTransferQueue<String>();
		new Thread(new LinkedTransferQueueProducer(tQue)).start();
		new Thread(new LinkedTransferQueueConsummer(tQue)).start();
	}
}
