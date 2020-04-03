package com.GetterSetterMethod;

import  com.ParameterisedConstructor.Address;

public class Person {

	int id;
	String name;
	Address a;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public static void main(String[] args) {
		
		Person p=new Person();
		p.setId(10);
		p.setName("vijayraj");
		p.setA(new Address("pune",41));
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getA().city);
		System.out.println(p.getA().zip);
		

	}

}
