package com.classLectureComparator;

import java.util.Comparator;

public class IdComparator implements Comparator <Emp>{

	@Override
	public int compare(Emp e, Emp e1) {
		
		return e.id-e1.id;
	}

	@Override
	public String toString() {
		return "IdComparator []";
	}

	

}
