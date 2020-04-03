package com.Assignmentclass;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CopyHashMapTOLInkedHashMap {
    
	public static void main(String[] args) {
		
		HashMap<Integer ,String > hm=new HashMap<Integer, String>();
		hm.put(3, "Robin");
		hm.put(4, "Body");
		hm.put(5, "heel");
		hm.put(2, "nam");
	
		System.out.println(hm);
		
		LinkedHashMap <Integer ,String > hm1=new LinkedHashMap<Integer, String>();
		//System.out.println(hm1);
		
		
		hm1.put(3, "Robin");
		hm1.put(4, "Body");
		hm1.put(5, "heel");
		hm1.put(2, "nam");
		
//		hm1.clear();
		System.out.println(hm1);
		
		
          
		
		
		
	}
}
