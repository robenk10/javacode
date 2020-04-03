package com.septBatchPaper;

import java.util.*;


/*
 * 
 * 
 * 
 */
 

public class StudDemo {


	public static void main(String[] args) {

		Student s1=new Student(1,"akash","pune",68f);
		Student s2=new Student(1,"abhinav","nagar",60f);
		Student s3=new Student(1,"bhampya","ahmednagar",68f);
		Student s4=new Student(1,"amit","jalna",68f);
		Student s5=new Student(1,"neha","dhule",64f);

		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		TreeMap<Float,ArrayList<Student>> tm=new TreeMap<Float,ArrayList<Student>>(Collections.reverseOrder());
		ArrayList<Student> slist ;
				 for(Student s : al) {
					 if(tm.containsKey(s.marks)) 
						 slist = tm.get(s.marks);
						 else 
							 slist = new ArrayList();
					 slist.add(s);
					 tm.put(s.marks , slist) ;
					 }
				 
				 System.out.println(tm);
				 }
		

	}

