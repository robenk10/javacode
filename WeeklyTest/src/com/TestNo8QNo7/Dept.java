package com.TestNo8QNo7;

public class Dept {
   
	int deptid;
	String dname;
	String city;

	
	public Dept(int deptid, String dname, String city) {
		this.deptid = deptid;
		this.dname = dname;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", dname=" + dname + ", city=" + city + "]";
	}
	
	
	
	
	
}
