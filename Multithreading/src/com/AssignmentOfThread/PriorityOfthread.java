package com.AssignmentOfThread;

class Threads1 extends Thread
{
	public  void run()
	{
		System.out.println("priority of thread: "+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		
	}
}

public class PriorityOfthread {

	public static void main(String[] args) {
		 
		Thread t1=new Threads1();
	     
		Thread t2=new Thread();
		
		t1.setPriority(5);
		//t1.setPriority(Thread.MIN_PRIORITY+1);
		//t1.setPriority(9);
		//t1.setPriority(6);
		t1.start();
		

	}

}
