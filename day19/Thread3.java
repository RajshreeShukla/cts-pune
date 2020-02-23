package com.Multithreading;

public class Thread3 implements Runnable {

	@Override
	public void run() {
	
		int num=4;
		for(int i=1;i<=10;i++) {
			
			num=i*4;
			System.out.println(num);
		}System.out.println("Thread3");
	}
}
