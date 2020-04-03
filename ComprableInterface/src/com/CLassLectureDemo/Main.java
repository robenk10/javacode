package com.CLassLectureDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {

		ArrayList<Emp> e = new ArrayList();

		e.add(new Emp(1, "robin"));
		e.add(new Emp(4, "ajay"));
		e.add(new Emp(2, "samsir"));

		Collections.sort(e);
		// System.out.println(e);

		Iterator itr = e.iterator();
		while (itr.hasNext()) {
			Emp e1 = (Emp) itr.next();
			System.out.println(e1);

		}

		
		HashSet<Integer > a=new HashSet();
		a.add(3);
		a.add(2);
		a.add(9);
		a.add(7);
		a.add(4);
		a.add(8);
		System.out.println(a);
		
				
		
		  
		PriorityQueue<Integer> queue=new PriorityQueue();  
	
		queue.add(5);
		queue.add(2);  
		queue.add(9);  
		queue.add(1);  
		System.out.println(queue);
		
		
		String s="";
		System.out.println(s.isEmpty());

	}

}
