package com.Multithreading;

public class Player2 implements Runnable {

	@Override
	public void run() {
		System.out.println("player2 is ready");
		for (int i = 1; i <= 10; i++) {

			System.out.println("ping2");

			try {
				Thread.sleep(102);

			} catch (InterruptedException e) {
				e.printStackTrace();
				// System.out.println("ping2");
			}
		}
		// System.out.println("ping2");
	}

}
