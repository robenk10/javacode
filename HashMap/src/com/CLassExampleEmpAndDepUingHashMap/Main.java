package com.CLassExampleEmpAndDepUingHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Emp> al=new ArrayList <Emp>();
		
		al.add(new Emp(101,"amit",10));
		al.add(new Emp(102,"neha",10));
		al.add(new Emp(103,"Deepak",10));
		al.add(new Emp(104,"nishad",12));
		
		

		ArrayList<Dept> al1=new ArrayList <Dept>();
		
		al1.add(new Dept(10,"sales"));
		al1.add(new Dept(20,"marketing"));
		
		
		String s="sales";
		
		int did;
		  ArrayList<EmpInfo> al2 = al2=new ArrayList();
		
		Iterator itr=al1.iterator();
		
		while(itr.hasNext())
		{
			Dept d=(Dept) itr.next();
			if(d.dname.equals(s))
			{
				Iterator itr2=al.iterator();
				while(itr2.hasNext())
				{  
					Emp e=(Emp) itr2.next();
					if(d.did==e.did)
					{
					  
					  al2.add(new EmpInfo(e.id,e.name));
					}
				}
			}
		}
		
		HashMap<String ,ArrayList<EmpInfo>> hm=new HashMap();
		
		hm.put(s, al2);
		
		Set s1=hm.entrySet();
		
		Iterator itr4=s1.iterator();
		//System.out.println(hm.get(s));
		
		while(itr4.hasNext())
		{
			Map.Entry m=(Entry) itr4.next();
			
			String s2=(String) m.getKey();
			
			ArrayList <EmpInfo>ef=(ArrayList) m.getValue();
			
			System.out.println( s2);
			for(EmpInfo n:ef)
			{
				System.out.println(n.id+" "+n.name);
			}
	        
			
			
		}
		
		
		
		

	}

}
