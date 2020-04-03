package com.AssignmentOfThread;

public class CreatingDaemonThread implements Runnable{

	@Override
	public void run() {
		
if(Thread.currentThread().isDaemon())
{
		System.out.println("Thread is running or not");
		
		mythread4 t=new mythread4();
		
		Thread t1=new Thread(t);
		t1.start();
}
		
	}

}

class mythread4 implements Runnable
{

	@Override
	public void run() {
		System.out.println("Threadddss");
		
	}
	
}
