package com.DefaultConstructor;

public class Person {
	 
	int id;
	String name;
	Address a;
	
	Person()
	{
		id=100;
		name="amit";
		a=new Address();
	}
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", a=" + a + "]";
	}



	public void display()
	{
		System.out.println(id+" "+name+" "+a.city);
		
	}

	public static void main(String[] args) {
		
	 	Person p=new Person();
	    System.out.println(p.toString());	
		p.display();

	}

}
