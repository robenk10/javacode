package com.ExamQuestion;



public class BusTicket{

	
	private int book[] =new int[3];
	
	private int seat=0;
	
	
	public void bookSeat()
	{
		int count=1;
		if(seat<book.length)
		{
			book[seat]=count;
			seat++;
			
			
			System.out.println("seat are booked  seat no are "+seat+"confirmed");
		}
		else
		{
			System.out.println("seat are full");
		}
	}
}
