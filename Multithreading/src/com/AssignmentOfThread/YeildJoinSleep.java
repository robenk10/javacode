package com.AssignmentOfThread;
class Allin extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			try
			{
			Thread.currentThread().sleep(10000);
			}
			catch(Exception e)
			{
				e.fillInStackTrace();
			}
		System.out.println(Thread.currentThread().getName());
		}
	}
}
public class YeildJoinSleep {

	public static void main(String[] args) {
		
		Thread t1=new Allin();
		
		Thread t2=new Allin();
		
		
		
		t1.yield();
		t1.start();

		t2.start();
		
		try
		{
			t2.join(10000);
		}
		catch(InterruptedException e)
		{
			e.fillInStackTrace();
			
		}

	}

}
