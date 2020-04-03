package com.Additional;

import java.util.ArrayList;

public class Dept {
     
	int id;
	String name;
	ArrayList<Student> al=new ArrayList<Student>(); 
	
	
	public Dept(int id, String name, ArrayList<Student> al) {
		this.id = id;
		this.name = name;
		this.al = al;
	}


	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", al=" + al + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Dept d=(Dept) obj;
		if(this.id==d.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
}
