package com.RelayRaceOf3Comptetor;

public class Race implements Runnable{
     PassRelay p;
     
     
     Race(PassRelay p)
     {
    	 this.p=p;
     }
     
     
	@Override
	public void run() {
		
		synchronized(PassRelay.class)
		{
			p.Running();
			System.out.println(Thread.currentThread().getName());
			
		}
	}

}
