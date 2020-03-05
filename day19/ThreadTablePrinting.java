package com.Multithreading;

public class ThreadTablePrinting  {
	public static void main(String[] args) throws InterruptedException {
		Thread2 table2=new Thread2();
		Thread3 table4=new Thread3();
		Thread t1 = new Thread(table2);
		Thread t2 = new Thread(table4);
		//t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t1.join();
		//t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		t2.join();
		
	
	}

	
}
