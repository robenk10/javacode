package com.Question2;

public class Company {
  
	public void address()
	{
		System.out.println("In Company class Method");
	}
}

class Ebay extends Company
{
	public void address()
	{
		System.out.println("Overridden Method In Ebay Class");
	}
}
