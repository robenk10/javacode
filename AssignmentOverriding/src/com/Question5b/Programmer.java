package com.Question5b;

public class Programmer {

	int hr;

	public void workingHour(int hr)
	{
		this.hr=hr;
		System.out.println("In Class Programmer Method working hr "+hr);
	}
}

class Employee extends Programmer
{
    public void workingHour(int hr)
    {
    	 System.out.println("In Class Employee Method Working hr "+hr);
    }
}
