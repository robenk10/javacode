package com.DeepCopy;

public class Dept implements Cloneable {
   
	int did;
	String dname;
	public  Dept(int did, String dname) {
	    this.did = did;
		this.dname = dname;
	}
	 
	 public Dept clone() throws CloneNotSupportedException
	 {  
		return (Dept) super.clone();
		 
	 }
}
