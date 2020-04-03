package com.Question5;

public class Bike {
	String color;
	int speed;

	public void bikeInfo(String color,int speed)
	{
       this.color=color;
       this.speed=speed;
       System.out.println("IN Bike Class Method");
	}
}


class Pulsar extends Bike
{
	public void bikeInfo(String color,int speed)
	{
       System.out.println(color+" 	"+speed);
       System.out.println("In pulsar class Overridden Method");
	}
}
