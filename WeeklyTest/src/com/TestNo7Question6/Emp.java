package com.TestNo7Question6;

public class Emp {
    
	int id;
	String name;
	int sal;
	
	
	Emp(int id, String name, int sal) {
	
		this.id = id;
		this.name = name;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
	
}
