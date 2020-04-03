package com.AssignMentHw;

public class Emp {
        
	int id;
	String name;
	int sal;

	
	public Emp(int id, String name, int sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
