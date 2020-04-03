package com.ShallowClone;

public class Emp implements Cloneable{
    
	 int id;
	 String name;
	 Dept d;
     
	 
	 public Emp(int id, String name, Dept d) {
		this.id = id;
		this.name = name;
		this.d = d;
	}
	 
	 public Emp clone() throws CloneNotSupportedException
	 {  
		 
		return (Emp) super.clone();
		 
	 }
}
