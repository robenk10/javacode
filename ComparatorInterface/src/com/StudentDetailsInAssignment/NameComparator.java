package com.StudentDetailsInAssignment;

import java.util.Comparator;

public class NameComparator implements Comparator <Student>{



	@Override
	public String toString() {
		return "NameComparator []";
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

	
	

}
