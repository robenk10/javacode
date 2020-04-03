package com.classWorkAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AddElementIntoHashmapWithoutUsingGeneric {

	public static void main(String[] args) {

		HashMap <Integer ,String> hm = new HashMap();

		hm.put(1, "a");
		hm.put(2, "b");
		hm.putIfAbsent(3, "c");

		System.out.println(hm);

		
		  for(Map.Entry m : hm.entrySet()) {
		        
			  System.out.println(m.getKey()+" "+m.getValue());
		  }
		  
		 

		Set s = hm.entrySet();

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Map.Entry m = (Entry) itr.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
