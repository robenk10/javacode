package com.Question3;

public class Vehicle {


	public void acelarate(long mph)
	{
         System.out.println(mph);
	}

	public String stop()
	{
		return "";
	}
	
	public String run()
	{
		return "";
	}


}

class Car extends Vehicle
{
	public void acelarate(long mph)
	{
     System.out.println(mph);
     System.out.println("In OverRidden Method Car Class");
	}
}
