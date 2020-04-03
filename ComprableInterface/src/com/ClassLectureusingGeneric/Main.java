package com.ClassLectureusingGeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Emp> e=new ArrayList();
		 
		e.add(new Emp(1,"robin"));
		e.add(new Emp(4,"ajay"));
		e.add(new Emp(2,"samsir"));
		
		Collections.sort(e);
		//System.out.println(e);
		
		Iterator itr= e.iterator();
		while(itr.hasNext())
		{
			Emp e1=(Emp) itr.next();
			System.out.println(e1);
			
		}
		

	}

}
