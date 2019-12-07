package multithreadings.threadpool;

public class MyExecutorJob extends Thread{
	
	String name;

	public MyExecutorJob(String name) {
		this.name = name;
	}
	@Override
	public void run() {

		System.out.println(name+" ..jib started by "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" ..jib finished by "+Thread.currentThread().getName());
	}
}
