package multithreading.runnableinterface.thread1;

public class MyThreadExecute {
	public static void main(String[] args) {

		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("main thread");
		}
	}

}
