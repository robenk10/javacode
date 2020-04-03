package com.StudentDetailsInAssignment;

import java.util.Comparator;

public class AgeComparator implements Comparator  <Student>{

	@Override
	public String toString() {
		return "AgeComparator []";
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.Age-o2.Age;
	}

	
}
