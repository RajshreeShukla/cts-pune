package com.Multithreading;

public class ThreadOne implements Runnable {
 Resource resource;
 public ThreadOne(Resource resource) {
	 this.resource=resource;
 }
	@Override
	public void run() {
		resource.display("Thread-1");
	/*	for (int i = 1; i <= 10; i++) {
			System.out.println("Thread-1:" + i);
		}try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}*/
	}
}
