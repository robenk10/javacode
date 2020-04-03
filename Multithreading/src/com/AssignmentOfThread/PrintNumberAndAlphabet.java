package com.AssignmentOfThread;


class NumberA implements Runnable
{

	
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
}

class Alphabet implements Runnable
{

	
	@Override
	public void run() {
		
		for(char i=97;i<=107;i++)
		{ 
			try
			{
			Thread.currentThread().sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
}
public class PrintNumberAndAlphabet {
	
	 public static void main(String[] args) {
		
		 NumberA t=new NumberA();
		 Alphabet b=new Alphabet();
		 Thread t1=new Thread(t);
		 
		 Thread t2=new Thread(b);
		 t2.start();
		 
		 try {
			t2.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 t1.start();
		
		 try {
			t1.join(10000,10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
}
