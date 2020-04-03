package com.NestedContaintment;

import  com.ParameterisedConstructor.Address;
public class Emp {
	int id;
	String name;
	Dept d;


	public Emp(int id, String name, Dept d) {
		

		this.id = id;
		this.name = name;
		this.d = d;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+d.a.city+" "+d.a.zip);
		System.out.println(id+" "+name+" "+d);
		
	}


	public static void main(String[] args) {
		
		Emp e=new Emp(101,"Amit",new Dept(10,"sales",new Address("pune",41)));
		e.display();

	}

}
