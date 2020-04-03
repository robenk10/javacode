package com.classLectureContainment;

import java.util.ArrayList;
import java.util.Collections;



public class Main {

	public static void main(String[] args) {
		
		ArrayList<Emp> e=new ArrayList();
		 
		e.add(new Emp(1,"robin",new Dept(14,"sales")));
		e.add(new Emp(1,"ajay",new Dept(14,"market")));
		e.add(new Emp(2,"samsir",new Dept(13,"science")));
		
		Collections.sort(e);
		System.out.println(e);
		

	}

}
