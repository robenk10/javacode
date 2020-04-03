package com.StudentDetailsInAssignment;

import java.util.Comparator;

public class Student implements Comparator <Student>{
   
	int rollno;
	String name;
	int Age;
	
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		Age = age;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", Age=" + Age + "]";
	}


	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
