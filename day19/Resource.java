package com.Multithreading;

public class Resource {
	public void display(String name) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Name Count : " + i + " - " + name);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
