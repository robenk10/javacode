package com.DeepCopy;

public class Emp implements Cloneable{

	
	 int id;
	 String name;
	 Dept d;
     
	 
	public  Emp(int id, String name, Dept d) {
		this.id = id;
		this.name = name;
		this.d = d;
	}
	 
	 public Emp clone() throws CloneNotSupportedException
	 {  
		 Emp e=(Emp) super.clone();
		 e.d=d.clone();
		 return e;
		 
	 }
}
