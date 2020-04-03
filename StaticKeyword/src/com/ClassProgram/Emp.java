package com.ClassProgram;

public class Emp {
	int id;
	String name;
	static String cName="TqPP";  
	// Checking Static variable using two object

	public static void main(String[] args) {
		Emp e=new Emp();
		e.id=10;
		e.name="amit";
		System.out.println(e.id+" "+e.name+" "+cName);
		
		Emp e1=new Emp();
		e1.id=111;
		e1.name="ajay";
		System.out.println(e1.id+" "+e1.name+" "+cName);
		
		
		
	}

}
