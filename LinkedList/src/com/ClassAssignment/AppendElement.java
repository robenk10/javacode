package com.ClassAssignment;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class AppendElement {

	public static void main(String[] args) {
		
		LinkedList <String> l=new LinkedList<String>();
		l.offer("ROBIn"	);
		l.offer("AJay"	);
		l.offer("hEyMAN"	);
		l.offer("BABu"	);
		l.offer("TRSJD"	);
		
		System.out.println(l.peek());
		System.out.println(l);
		
		//System.out.println(l.remove());
		System.out.println(l.size());
		System.out.println(l);
		 
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{  
			
			System.out.println(itr.next());
		}
		
		
		System.out.println(l);
	//	System.out.println(	l.subList(1, 3));
		
		
		
		
		ListIterator<String> itr1=l.listIterator(l.size());
		
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
			
		
		  
		
		l.set(2, "ASKSK");
		System.out.println(l);
		
		l.set(0, "Array");
		System.out.println(l);
	
		
		l.addFirst("ARAAA");
		System.out.println(l);
	
		
		l.addLast("hmgn");
		System.out.println(l);
		
		
		
		
	
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i)+"   ::   "+ i);
		}
		
		
		
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		
		
		Collections.sort(l);
		System.out.println(l);
		
		

	}

}
