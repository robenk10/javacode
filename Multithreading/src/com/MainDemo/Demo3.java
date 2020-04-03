package com.MainDemo;

import com.AssignmentOfThread.CreatingDaemonThread;

public class Demo3 {

	public static void main(String[] args) {
		
		CreatingDaemonThread t=new CreatingDaemonThread ();
		
		Thread t1=new Thread(t);
		t1.setDaemon(true);
		t1.start(); 
		
		

	}

}
