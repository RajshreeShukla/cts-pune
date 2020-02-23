package com.Multithreading;

public class ThreadDemoo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
//here we have only one thread(main)
		Resource res=new Resource();
		ThreadOne threadone = new ThreadOne(res);// new born state

		ThreadTwo threadtwo = new ThreadTwo(res);
		Thread t1 = new Thread(threadone);
		Thread t2 = new Thread(threadtwo);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		System.out.println("Mian thread Priority :"+Thread.currentThread().getPriority());
		System.out.println("Thread-1 Priority :"+t1.getPriority());
		System.out.println("Thread-2 Priority :"+t2.getPriority());
	}
}