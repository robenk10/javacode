package com.Assignment;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Intger1 {

	public static void main(String[] args) {
		
		
		
		TreeMap <Integer,Integer> tm=new TreeMap<Integer, Integer>();
		
		 tm.put(1, 12);
		 tm.put(3, 192);
		 tm.put(5, 14);
		 tm.put(2, 18);
		 
		 Set s=tm.entrySet();
		 
		 Iterator itr=s.iterator();
		 
         while(itr.hasNext())
         {
        	 Map.Entry e= (Entry) itr.next(); 
        	 
        	 Integer i=(Integer) e.getKey();
        	 Integer i1=(Integer) e.getValue();
        	 
        	 System.out.println(i+" "+i1);
         }
        System.out.println(tm.containsKey(3));         
	}

}
