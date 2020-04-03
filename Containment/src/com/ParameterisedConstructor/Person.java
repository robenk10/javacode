package com.ParameterisedConstructor;

//import com.DefaultConstructor.Address;

public class Person {
	
	int id;
	String name;
	Address a;
	
	
	

	public Person(int id, String name, Address a) {
		
		this.id = id;
		this.name = name;
		this.a = a;
	}

	public void display()
	{
		System.out.println(id+" "+name+" "+a.city+" "+a.zip);
		System.out.println(id+" "+name+" "+a);
		
	}


	public static void main(String[] args) {
		
		//Person p=new Person(111,"amit",new Address());
		//p.display();
		
		
		Person p1=new Person(111,"amit",new Address("pune",41));
		p1.display();
		

	}

}
