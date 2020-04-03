package com.AssignmentNo9;

final public class Bike {
     
	final int speed=120;
	
	final void foo()
	{
		System.out.println(speed);
	}
	
	public static void main(String[] args) {
		
		Bike b=new Bike();
		System.out.println(b.speed);
		b.foo();
		
	}
}
