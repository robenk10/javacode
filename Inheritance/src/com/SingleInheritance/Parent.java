package com.SingleInheritance;

public class Parent {
     
	String name="jadhav";
	String properties="15 lakh";
	
	public void surname()
	{
		System.out.println("shukla");
	}
	public void properties()
	{
		System.out.println("20 lakh");
	}
}


class Child extends Parent
{  
	
	public void surname()
	{
		System.out.println(name);
	}
	public void properties()
	{
		System.out.println(properties);
	}
}
