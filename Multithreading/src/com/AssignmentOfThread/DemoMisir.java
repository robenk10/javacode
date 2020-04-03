package com.AssignmentOfThread;

import java.util.Scanner;

class ac implements Runnable
{
	int balance=1000;
	Scanner sc=new Scanner(System.in);
	public synchronized void withdraw(int t) {
		
		if(balance>t)
		{
			balance -=t;
			System.out.println(balance);
		}
		else
		{
			System.out.println("invalid amout");
		}
	}
	
	@Override
	public void run() {
	System.out.println("Withdraw Amout");
	int	t=sc.nextInt();
		withdraw(t);
		
	}
	
}
public class DemoMisir {

	public static void main(String[] args) {
		
      ac a=new ac();
      Thread t1=new Thread(a);
      Thread t2=new Thread(a);
      
      t1.start();
      t2.start();
      
	}

}
