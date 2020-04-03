package com.CustomClassandJDKvalue;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		HashMap<Emp,String> hm=new HashMap<Emp,String>();
		
		hm.put(new Emp(3,"abc"), "Robin");
		hm.put(new Emp(1,"xyz"), "ajay");
		hm.put(new Emp(1,"fhg"), "namin");
		
		for(Map.Entry m:hm.entrySet())
		{
			Emp e=(Emp) m.getKey();
			String s=(String) m.getValue();
			
			System.out.println(e.id+" "+e.name+" "+s);
		}
		
		
  HashMap<Emp,Dept> hm1=new HashMap<Emp,Dept>();
		
		hm1.put(new Emp(3,"abc"), new Dept(12,"sale"));
		hm1.put(new Emp(1,"xyz"), new Dept(11,"market"));
		hm1.put(new Emp(2,"gdggd"), new Dept(12,"sale"));
	

	  
	
	for(Map.Entry m1:hm1.entrySet())
	{
		Emp e1=(Emp) m1.getKey();
		Dept d1=(Dept) m1.getValue();
		
		System.out.println(e1.id+" "+e1.name+","+d1.did+" "+d1.dname);
	}
}

}