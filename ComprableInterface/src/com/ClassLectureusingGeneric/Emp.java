package com.ClassLectureusingGeneric;



public class Emp implements Comparable <Emp>
 
{
	
	int id;
	String name;
	
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Emp e) {
		//Emp e=(Emp) o;
		return this.name.compareTo(e.name);
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
