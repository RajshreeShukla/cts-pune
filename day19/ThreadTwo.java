package com.Multithreading;

public class ThreadTwo implements Runnable {
	Resource resource;
	 public ThreadTwo(Resource resource) {
		 this.resource=resource;
	 }

	@Override
	public void run() {
		resource.display("Thread-2");
	}
		
	}



