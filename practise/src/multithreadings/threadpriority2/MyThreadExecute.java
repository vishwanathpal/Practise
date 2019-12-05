package multithreadings.threadpriority2;

public class MyThreadExecute {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.setPriority(10);
		t.start();
		
		for (int i = 0; i <= 30; i++) {
			System.out.println("main thread");
		}
	}
}
//the output is not as expected b/c some operating system not provide thread priority.