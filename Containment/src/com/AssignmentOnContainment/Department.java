package com.AssignmentOnContainment;

public class Department {
     
	int id;
	String name;
	
	Department(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
