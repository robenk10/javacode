package com.AssignmentOnContainment;

public class Student {
	int rollNo;
	String name;
	Department d;
	
	Student(int rollNo,String name,Department d)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.d=d;
	}
	
	public void disp()
	{
		System.out.println(rollNo+" "+name+" "+d);
	}
	public static void main(String[] args) {
		
		Student s=new Student(11,"amit",new Department(1002,"sales"));
		s.disp();
	}

}
