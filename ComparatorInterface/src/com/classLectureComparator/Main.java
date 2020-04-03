package com.classLectureComparator;

import java.util.ArrayList;
import java.util.Collections;




public class Main {

	public static void main(String[] args) {
		
		ArrayList<Emp> e=new ArrayList <Emp>();
		 
		e.add(new Emp(1,"robin"));
		e.add(new Emp(4,"ajay"));
		e.add(new Emp(2,"samsir"));
		
		Collections.sort(e,new IdComparator());
		Collections.sort(e, new NameComparator());
		
		System.out.println(e);

	}

}
