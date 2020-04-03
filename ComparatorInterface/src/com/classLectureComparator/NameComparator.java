package com.classLectureComparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Object>{

	

	@Override
	public int compare(Object o1, Object o2) {
		Emp e=(Emp) o1;
		Emp e1=(Emp)o2;
		return e.name.compareTo(e1.name);
	}

	@Override
	public String toString() {
		return "NameComparator []";
	}
       
	
}
