package com.ExamQuestion;

public class Passanger extends Thread {

	BusTicket bus;
	
	Passanger( BusTicket bus)
	{
		this.bus=bus;
	}
	public void run()
	{
		synchronized(BusTicket.class)
		{
			bus.bookSeat();
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
