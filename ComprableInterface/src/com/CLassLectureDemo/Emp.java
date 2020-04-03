package com.CLassLectureDemo;

public class Emp implements Comparable

{
	
	int id;
	String name;
	
	Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Object o) {
		Emp e=(Emp) o;
		return e.id-this.id;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
