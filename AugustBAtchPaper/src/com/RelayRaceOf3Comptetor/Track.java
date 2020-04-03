package com.RelayRaceOf3Comptetor;

public class Track {
 
	public static void main(String args[])
	{ 
		PassRelay p=new PassRelay();
		
		Race r1=new Race(p);
		Thread t1=new Thread(r1);
		t1.setName("Player1");
		t1.start();
		
		
		Race r2=new Race(p);
		Thread t2=new Thread(r2);
		t2.setName("Player2");
		t2.start();
	}
}
