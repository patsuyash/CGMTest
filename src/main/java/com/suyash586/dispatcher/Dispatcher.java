package com.suyash586.dispatcher;

import java.lang.reflect.InvocationTargetException;

public class Dispatcher {

	private String methodName;

	public Dispatcher() {
	}

	public Dispatcher(String methodName) {
		this.methodName = methodName;
	}

	public Object dispatch(Object param) {
		java.lang.reflect.Method method = null;
		try {
			method = this.getClass().getMethod(methodName, param.getClass());

		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
		}

		try {
			method.invoke(param);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return param;
	}

}
