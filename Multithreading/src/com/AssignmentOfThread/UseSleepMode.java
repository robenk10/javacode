package com.AssignmentOfThread;

class Sleepmode extends Thread
{

	public Sleepmode(String string) {
		System.out.println(string);
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread());
		
		if(Thread.currentThread().getName().equals("Robin"))
		{ 
			System.out.println("hello Brother");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello_all");
		}
		else
		{
			System.out.println("good night");
		}
		
	}
	
}
public class UseSleepMode {

	public static void main(String[] args) {
	
		Sleepmode s=new Sleepmode("Heelo");
		
		Thread t=new Thread(s,"Robin");
		t.start();
		
		

	}

}
