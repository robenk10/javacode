package com.AssignmentAdditional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmpMain {

	public static void main(String[] args) {
		
		ArrayList<EmployeeClass> al=new ArrayList();
        
		al.add(new EmployeeClass(10,"ak",new Dept(12,"sale")));
		al.add(new EmployeeClass(11,"aka",new Dept(11,"market")));
		al.add(new EmployeeClass(12,"akas",new Dept(13,"Devloper")));
		al.add(new EmployeeClass(13,"akash",new Dept(14,"saleman")));
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			//EmployeeClass e=(EmployeeClass) itr.next();
			//System.out.println(e.id+" "+e.name+" "+e.d.did+" "+e.d.dname);
			
			System.out.println(itr.next());
		}
		
		
	//ArrayList<EmployeeClass> al1=(ArrayList<EmployeeClass>) al.clone();
	
	  //System.out.println(al1);
		
		//System.out.println(al.indexOf(1));
	
	ArrayList<EmployeeClass> al1=new ArrayList();
	
	//System.out.println(al1.size());
	
	Collections.copy(al1, al);
    
	
	Iterator itrq=al1.iterator();
	while(itrq.hasNext())
	{
		//EmployeeClass e=(EmployeeClass) itr.next();
		//System.out.println(e.id+" "+e.name+" "+e.d.did+" "+e.d.dname);
		
		System.out.println(itrq.next());
	}
		
	}

}
