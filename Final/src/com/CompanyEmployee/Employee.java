package com.CompanyEmployee;

public class Employee {
  
	String empName;
	public int empId;
	public int hrOfWork;
	
	
	public void partTime()
	{
		int parttimesal=hrOfWork*200;
		System.out.println(parttimesal);
	}
	
	public void fullTime()
	{
		int fulltimesal=hrOfWork*500;
		System.out.println(fulltimesal);
	}
}
