package com.cqb.exam;

import java.lang.reflect.Method;

public class Reflect extends Thread {
	public void run() {
		Class clazz = Count.class;
		try {
			Count count = (Count) clazz.newInstance();
			Method method = clazz.getMethod("test");
			method.invoke(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Reflect reflect = new Reflect();
		reflect.start();
	}
}
