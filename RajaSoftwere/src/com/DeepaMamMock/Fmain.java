package com.DeepaMamMock;

import java.util.*;

public class Fmain {

	public static void main(String[] args) {
		
		List<Hobbies> list=new ArrayList<Hobbies>();
		list.add(new Hobbies("swimming"));
		list.add(new Hobbies("Running"));
		
		List<Hobbies> list1=new ArrayList<Hobbies>();
		list1.add(new Hobbies("swimming"));
		list1.add(new Hobbies("cricke"));
		
	    Map<Student ,List<Hobbies>> map=new HashMap<Student, List<Hobbies>>();
	    map.put(new Student("robin"), list);
	    map.put(new Student("Deepa"), list1);
	    
	    Map<String,List<String>> map1=new HashMap<String, List<String>>();
	    ArrayList<String> al=null;
	    
	    for(Map.Entry<Student, List<Hobbies>> m:map.entrySet()) {
	    	
	    	Student nm=m.getKey();
	    	List<Hobbies> alist=m.getValue();
	    
	    	for(int i=0;i<alist.size();i++) {
	    	if(! map1.containsKey(alist.get(i).hobbies)) {
	    			al=new ArrayList<String>();
	    			}
	    		else {
	    			al=(ArrayList<String>) map1.get(alist.get(i).hobbies);
	    		}
	    		al.add(nm.name);
	    		map1.put(alist.get(i).hobbies, al);
	    	}
	    }
	    
	    map1.forEach((k,v) ->{
	    	System.out.println(k+ " "+ v);
	    	
	    });

	}

}
