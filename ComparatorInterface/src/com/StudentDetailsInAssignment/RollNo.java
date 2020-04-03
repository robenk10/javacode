package com.StudentDetailsInAssignment;

import java.util.Comparator;

public class RollNo implements Comparator <Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.rollno-o2.rollno;
	}

	@Override
	public String toString() {
		return "RollNo []";
	}
	
	

}
