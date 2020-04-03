package com.NestedContaintment;

import com.ParameterisedConstructor.Address;

public class Dept {
	
	int did;
	String dname;
	Address a;
	public Dept(int did, String dname, Address a) {
	
		this.did = did;
		this.dname = dname;
		this.a = a;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + ", a=" + a + "]";
	}
	
	
	

}
