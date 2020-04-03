package com.AssignmentOfThread;

class table extends Thread
{
	int j=5;
    
	static synchronized  void run(int j)
	{
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(j*i);
			
			try
			{
			Thread.currentThread().sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		
	}
	
 public void run()
 {	
	 run(j);
	 System.out.println(j);
		
	}
}
public class Synchronised {

	public static void main(String[] args) {
		
		table t=new table();
		
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();

	}

}
