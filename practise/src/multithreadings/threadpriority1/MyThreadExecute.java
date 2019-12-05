package multithreadings.threadpriority1;

public class MyThreadExecute {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		//Thread.currentThread().setPriority(15);	//Exception in thread "main" java.lang.IllegalArgumentException
		MyThread t = new MyThread();
		System.out.println(t.getPriority());
	}
}