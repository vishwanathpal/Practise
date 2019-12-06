package multithreadings.interthreadcommunication1;

public class InterMyThreadExecute {

	public static void main(String[] args) throws InterruptedException {

		InterMyThread imt = new InterMyThread();
		imt.start();
		//Thread.sleep(10);
		//imt.join();
		imt.wait();
		System.out.println(imt.total);
	}
}
//try to calling wait() method without synchronized block and get "IllegalMonitorStateException"
// sleep() and join method also useful but not recommended because sleep() method wait till time is over and join() method wait till
// the complete code execution finish, both are not recommended.