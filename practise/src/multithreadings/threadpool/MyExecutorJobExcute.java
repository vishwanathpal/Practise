package multithreadings.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorJobExcute {

	public static void main(String[] args) {

		MyExecutorJob[] jobs = {new MyExecutorJob("vish"),
								new MyExecutorJob("paul"),
								new MyExecutorJob("raha"),
								new MyExecutorJob("dura"),
								new MyExecutorJob("kama"),
								new MyExecutorJob("govi")};	
	ExecutorService service = Executors.newFixedThreadPool(6);
	for(MyExecutorJob job : jobs) {
		service.submit(job);
	}
	service.shutdown();
	}
}
