package com.classdemo;

public class MainthreadDemo {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("main thread");
		System.out.println(t.getName());
	
		Thread.currentThread().setName("xyz");
		System.out.println(Thread.currentThread().getName());
	}

}
