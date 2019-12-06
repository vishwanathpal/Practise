package multithreadings.interthreadcommunication2;

public class InterMyThreadExecute {

	public static void main(String[] args) throws InterruptedException {

		InterMyThread imt = new InterMyThread();
		imt.start();
		System.out.println("main thread sleeping");
		//Thread.sleep(10000); //no out put stuck
		synchronized(imt) {
			System.out.println("main thread trying to call wait() method");
			//imt.wait(10000); //to wait for 10sec and execute the rest of the program like polling trigger
			imt.wait();  //execute just after notify like webhook.
			System.out.println("main thread got notified");
			System.out.println(imt.total);
		}
	}
}