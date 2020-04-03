package com.StudentDetailsInAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(12,"abhi",9));
		al.add(new Student(2,"abhi",9));
		al.add(new Student(5,"durga",49));
		al.add(new Student(2,"gabru",59));
		
		Collections.sort(al, new NameComparator());
		System.out.println(al);
		
		Collections.sort(al, new AgeComparator());
		System.out.println(al);
		
		Collections.sort(al, new RollNo());
		System.out.println(al);
		

	}

}
