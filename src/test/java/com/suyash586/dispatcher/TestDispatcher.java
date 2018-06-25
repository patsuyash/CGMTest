package com.suyash586.dispatcher;

public class TestDispatcher extends Dispatcher {
	public TestDispatcher() {
		super("test"); // the name of the method
	}

	// methods

	public Object test(Object par) {
		System.out.println("Object");
		return par;
	}

	public Object test(String par) {
		System.out.println("String");

		return par;
	}
}
