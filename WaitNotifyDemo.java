package com.classdemo;
class Customerr
{
	int amount=10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw");
		if(this.amount < amount )
		{
			System.out.println("less balance, wait for deposit");
			try {
			wait();
			}catch(InterruptedException e)	
			{
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println(Thread.currentThread().getName()+" "+ this.amount);
		System.out.println("withdraw completed");
		
	}
	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit");
		this.amount=this.amount+amount;
		System.out.println(Thread.currentThread().getName()+" "+ this.amount);
		System.out.println("deposit completed");
		notifyAll();
	}
}
public class WaitNotifyDemo {

	public static void main(String[] args) {
		
		final Customerr c=new Customerr();
		new Thread()
		{
			public void run()
			{
				c.withdraw(15000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
			c.deposit(10000);
			}
		}.start();
	}

}
