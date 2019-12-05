package multithreadings.synchronization;

public class SynchronizationTest {

	public static void main(String[] args) {

		Display d = new Display();
		MyThread t1 = new MyThread(d, "doni");
		MyThread t2 = new MyThread(d, "yuva");
		MyThread t3 = new MyThread(d, "harb");
		MyThread t4 = new MyThread(d, "sach");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
