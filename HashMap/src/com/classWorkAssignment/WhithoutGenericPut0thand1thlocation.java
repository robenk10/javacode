package com.classWorkAssignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class WhithoutGenericPut0thand1thlocation {

	public static void main(String[] args) {
	  
		HashMap hm=new HashMap();
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("c", 3);
		hm.put("d", 4);
		hm.put("e", 5);
		hm.put("a", 6);
		
		
		HashMap hm1=new HashMap();
		hm1.putAll(hm);
		System.out.println(hm1);
		
		
		//hm1.remove("c");
		//System.out.println(hm1);
		
		
		Integer i=(Integer) hm1.get("a");
		
		System.out.println(i);
		
		
	    Boolean b=hm1.containsKey("a");
	    System.out.println(b);
	    
	    
	    Set s=hm.keySet();
	    System.out.println(s);
	    
	    Set s1=hm.entrySet();
	    System.out.println(s1);
	    
	    
	    boolean b1=hm.containsValue(3);
	    System.out.println(b1);
	    
	    System.out.println(hm.equals(hm1));
	    
	    System.out.println(hm.isEmpty());
	    
	    Object x=hm.clone();
	    System.out.println(x);
	    
	    
	    int n=hm.size();
	    System.out.println(n);
	    
	    Collection ss=hm.values();
	    System.out.println(ss);
	    
	    
	    
	    
	    HashMap hmm=new HashMap();
	    hmm.put("A",23);
	    hmm.put(1, "rr");
	     
	    System.out.println(hmm);
	    
	    
	    
	    HashMap<String ,Integer> j=new HashMap();
	    
	    j.put("ABC", 12);
	    j.put("ABCd", 13);
	    j.put("ABCe", 14);
	    j.put("ABCf", 124);
	    
	    
	    System.out.println(j);
	    
	    
	    
	    Set s2=j.entrySet();
	    
	    Iterator itr1=s2.iterator();
	    
	    while(itr1.hasNext())
	    {
	    	Map.Entry mm=(Entry)itr1.next(); 
	    	
	    	if(mm.getKey().equals("ABCf"))
           {  
	    	
	    	System.out.println(mm.getKey()+" "+mm.getValue());
           }
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
		

	}

}
