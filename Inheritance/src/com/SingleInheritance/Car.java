package com.SingleInheritance;

public class Car {
	
   int gear=5;
   String model="HondaCity";
   
   public void run()
   {
	   System.out.println("Car is Stopped Position");
   }
   

}

class Honda extends Car
{   
	int gear=6;
	int top_speed=160;
	
	public void run()
	{
		System.out.println("Car is Running Position");
	}
	
	
	
}
