package com.AssignmentOfThread;


class Mythread1 implements Runnable
{
	public void run() {
		
		System.out.println("thread is running");
	}
	
}
public class ImplementRunnableInterface {
 
	public static void main(String[] args) {
	
         Thread t1=new Thread();
         t1.start();
       
         Thread t2=new Thread();
         t2.start();
          
         
	}

}
