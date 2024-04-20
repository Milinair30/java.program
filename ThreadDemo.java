package com.classdemo;

class MyThread extends Thread
{
	
	public void run()
	{
		System.out.println("this is my task");
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
	System.out.println("thread demo");
}
}
public class ThreadDemo {
	
	public static void main(String[] args) {
		
		MyThread th= new MyThread();
		th.start();
		th.setName("mili");
		th.setPriority(1);
		String name= th.getName();
		System.out.println(th.getId());
		System.out.println(th.getPriority());
		System.out.println(name);
		
		MyThread2 th1= new MyThread2();
		th1.setName("manasi");
		System.out.println(th.getName());
		System.out.println(th.getId());
		System.out.println(th.getPriority());
		System.out.println(name);
	}

}
