package com.cts.training.generics;

class Test<T>{
	private T obj;
	public T get() {
		return obj;
	}
	public void set(T ob) {
		this.obj=ob;
	}
}
public class Consumer {
public static void main(String[] args) {
	Test<Integer>t=new Test<>();
	Test<String>t2=new Test<>();
	t.set(5);
	int i=(int)t.get();
	System.out.println(i);
	t2.set("Hello");
	String s=t2.get();
	System.out.println(s);
	
}
}