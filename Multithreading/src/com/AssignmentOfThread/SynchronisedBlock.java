package com.AssignmentOfThread;

class myblock extends Thread
{
	
	
	public  void lock()
	{  
		System.out.println(Thread.currentThread().getName());
	
	synchronized (this) {
		
		
		System.out.println("in block "+Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getName()+" end");
	}
	}
	
	
	public void run()
	{
		lock();
	}
		
	
	
}

public class SynchronisedBlock {

	public static void main(String[] args) {
		
		myblock b=new myblock();
		
		myblock b1=new myblock();
		Thread t=new Thread(b);
		
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b);
		
		t.start();
		t1.start();
		//t2.start();
		
		
	}

}

