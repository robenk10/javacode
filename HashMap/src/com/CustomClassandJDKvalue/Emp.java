package com.CustomClassandJDKvalue;

public class Emp {
    
	int id;
	String name;
	
	
	public Emp(int id, String name) {
	
		this.id = id;
		this.name = name;
	}


	
	
	@Override
	public int hashCode() {
	 
		return this.id;
	}


	@Override
	public boolean equals(Object o) {
		
		Emp e=(Emp) o;
		
		if(this.id==e.id)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
