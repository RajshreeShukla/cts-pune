package com.cts.training.NestedClass;

class OuterClass {
	int i = 20;

	class InnerClass {
		int y = 30;
	}

}

public class ExampleNestedClass {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(outer.i);
		System.out.println(inner.y);

	}
}
