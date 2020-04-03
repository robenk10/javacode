package com.ConstructorChaining;

public class Cycle {
	
public	int accoountNo;
public	int noOfWheels;
	
	Cycle()
	{
		System.out.println("IM Default Constructor");
		
	}
	
	Cycle(int accountNo,int noOfWheels)
	{    
		this();
		
		System.out.println("Im ANOTHER CONSTRUCTOR");
	}
	
	

}
