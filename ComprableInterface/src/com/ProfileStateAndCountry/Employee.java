package com.ProfileStateAndCountry;

public class Employee implements Comparable <Employee>{
  
	int id;
	String name;
	Profile p;
	
	
	public Employee(int id, String name, Profile p) {
		
		this.id = id;
		this.name = name;
		this.p = p;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", p=" + p + "]";
	}


	@Override
	public int compareTo(Employee o) {
	
		return this.p.Countryname.compareTo(o.p.Countryname);
	}
	
	
	
	
	
	
}
