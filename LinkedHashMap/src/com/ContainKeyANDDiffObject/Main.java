package com.ContainKeyANDDiffObject;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	
		LinkedHashMap<String,Student> lm=new  LinkedHashMap<String, Student>();
		
		lm.put("Anmol",new Student(10,"amit"));
		lm.put("manoj",new Student(10,"manali"));
		lm.put("robin",new Student(10,"aks"));
		lm.put("bob",new Student(10,"sweta"));
		lm.put("zebra",new Student(10,"tamin"));
		
		
		//System.out.println(lm);s
		Set s=lm.entrySet();
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Entry) itr.next();
			
			String s1=(String) m.getKey();
			
			Student  e=(Student) m.getValue();
			
			System.out.println(s1+" "+e.id+" "+e.name);
		}
		
		
		
		
		LinkedHashMap <Integer ,String>lm1=new  LinkedHashMap ();
		
    
		lm1.put(1, "GGOIUG");
		lm1.put(1, "ajkjal");
		lm1.put(5, "ghttt");
		lm1.put(4, "ahsgr");
		lm1.put(2, "ttitha");
		System.out.println(lm1.containsKey("ajkjal"));
		System.out.println(lm1.keySet());
		System.out.println(lm1.remove(5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
