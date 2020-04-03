package com.SingleInheritance;

public class Emp {
  
	int id=16;
	String name="ammi";
	
	void details()
	{
		System.out.println(id+" "+name);
	}
}


class Person extends Emp
{   
	int id=15;
	String name="Akash";
	void details()
	{
		System.out.println(id+" "+name);
	}
}
