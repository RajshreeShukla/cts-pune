package com.Multithreading;

public class Player1 implements Runnable {

	@Override
	public void run() {

		System.out.println("player1 is raedy");
		for (int i = 1; i <= 10; i++) {
						System.out.println("ping1");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
//System.out.println("ping1");
			}
		}
	}
}
