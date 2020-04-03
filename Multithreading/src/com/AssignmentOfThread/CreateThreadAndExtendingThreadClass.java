package com.AssignmentOfThread;


 class Mythread extends Thread
{
	 public void run()
	 {
		 for(int i=1;i<=5;i++)
		 {  
			
			 System.out.println(Thread.currentThread().getName());
		 }
	 }
}
public class CreateThreadAndExtendingThreadClass {

	public static void main(String[] args) {
	
          Mythread t=new Mythread();
          Mythread t1=new Mythread();
          t.setName("r1");
          t.start();
          t1.setName("M1");
         t1.start();
         

          
          
	}

}
