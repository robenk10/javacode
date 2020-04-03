package com.HomeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		
		HashMap<Integer ,String > hm=new HashMap();
		
		hm.put(1, "Robin");
		hm.put(2, "gkdj");
		hm.put(4, "nmol");
		hm.put(3, "ajju");
		hm.put(6, "amol");
		hm.put(7, "go");
		
   HashMap<Integer ,String > hm1=new HashMap(hm);
   
   System.out.println(hm1);
		/*
		 * hm1.put(1, "Robin"); hm1.put(2, "gkdj"); hm1.put(4, "nmol"); hm1.put(3,
		 * "ajju"); hm1.put(6, "amol"); hm1.put(7, "go");
		 */
		
		hm1.putAll(hm);
		
		System.out.println(hm1);
		
	String s=hm.get(5);
	System.out.println(s);
	
	boolean b=hm.containsKey(5);
	System.out.println(b);
	
	Set s1=hm.keySet();
	System.out.println(s1);
	
	
	boolean b1=hm.containsValue("Robin");
	System.out.println(b1);
	
	hm.remove(1);
	System.out.println(hm);
	
		/*
		 * Set st=hm.entrySet();
		 * 
		 * Iterator itr=st.iterator();
		 * 
		 * while(itr.hasNext()) { Map.Entry m= (Entry) itr.next(); Integer i=(Integer)
		 * m.getKey();
		 * 
		 * 
		 * if(itr.hasNext()) { System.out.println(hm.get(i)); hm.remove(i); } else {
		 * break; }
		 * 
		 * 
		 * }
		 */
	
      	//System.out.println(hm);
	
	
	
	   for(Map.Entry m:hm.entrySet())
	   {
		   Integer i=(Integer) m.getKey();
		   
		   hm.remove(i);
		   
	   }
	   
	   System.out.println(hm);
	
	
	
	}

}
