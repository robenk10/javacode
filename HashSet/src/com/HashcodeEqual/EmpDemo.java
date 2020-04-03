package com.HashcodeEqual;

import java.util.*;

public class EmpDemo {

	public static void main(String[] args) {
		
		HashSet<Emp> set=new HashSet();
		
		
		//System.out.println(set.equals(set));
        
		//sSystem.out.println("after hashcode");
		set.add(new Emp(102,"Amit"));
		
		for(Emp e:set)	
		{
			System.out.println(e.sid+" "+e.sname);
		}
	}

}
