package com.MainDemo;

import com.AssignmentOfThread.TwoShareShareSameObject;

public class Demo {

	public static void main(String[] args) {
		 TwoShareShareSameObject  t=new  TwoShareShareSameObject ();
		
		 
		 Thread t1=new  Thread (t);
		 t1.start();
    
		 Thread t2=new  Thread(t);
		 t2.start();
	}

}
