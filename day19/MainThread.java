package com.Multithreading;

public class MainThread {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	//static method inside the thread class
	//content contain three objects                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
     //t.setName("rajshree");
    // System.out.println(t);
     //System.out.println(t.getPriority());
     System.out.println("is Demon: " +t.isDaemon());
     System.out.println("is alive: "+t.isAlive());
     System.out.println(" " +t.MAX_PRIORITY);
     System.out.println(" " +t.MIN_PRIORITY);
     
}
}
