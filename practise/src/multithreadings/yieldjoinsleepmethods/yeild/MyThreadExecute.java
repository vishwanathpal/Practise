package multithreadings.yieldjoinsleepmethods.yeild;

public class MyThreadExecute {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();
		
		for (int i = 0; i <= 30; i++) {
			System.out.println("main thread-1");
		}
	}
}
//some platform maynot provide support for yield method