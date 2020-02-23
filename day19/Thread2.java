package com.Multithreading;

public class Thread2 implements Runnable{
	@Override
	public void run() {
		int num=2;
		for(int i=1;i<=10;i++) {
			num=i*2;
			System.out.println(num);
		}
		System.out.println("Thread2");;
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();		
		
	}

}
}
