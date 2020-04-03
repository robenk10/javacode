package com.TestNo8QNo7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		ArrayList<Dept> al1=new ArrayList<Dept>();
		ArrayList<Address> al2=new ArrayList<Address>();
		ArrayList<EmpInfo> al3=new ArrayList<EmpInfo>();
		System.out.println("Enter the Emp Details");
		for(int i=1;i<=2;i++)
		{
			al.add(new Emp(sc.nextInt(),sc.next(),sc.nextInt()));
		}
		
		System.out.println("Enter the Dept Details");
		for(int i=1;i<=2;i++)
		{
			al1.add(new Dept(sc.nextInt(),sc.next(),sc.next()));
		}
		
		System.out.println("Enter the Address Details");
		for(int i=1;i<=2;i++)
		{
			al2.add(new Address(sc.nextInt(),sc.next()));
		}
		
		
		
		/*
		 * System.out.println("Enter the Empinfo Details"); for(int i=1;i<=3;i++) {
		 * al3.add(new EmpInfo(sc.next(),sc.next())); }
		 */
		
		int zip=444;
		String s="";
		int did;

		
		Iterator itr=al2.iterator();
		
	    while(itr.hasNext())
	    {
	    	Address a=(Address) itr.next();
	    	
	    	if(zip==a.zip)
	    	{
	    		s=a.city;
	    		
	    	
	    		Iterator itr1=al1.iterator();
	    		while(itr1.hasNext())
	    		{
	    			Dept d=(Dept) itr1.next();
	    			
	    			if(s.equals(d.city))
	    			{
	    				did=d.deptid;
	    				Iterator itr3=al.iterator();
	    				
	    				while(itr3.hasNext())
	    				{
	    					Emp e=(Emp) itr3.next();
	    					
	    					if(did==e.deptid)
	    					{  
	    						
	    					  al3.add(new EmpInfo(e.ename,d.dname));
	    				   System.out.println(e.ename+" "+d.dname);
	    					  }
	    					}
	    				}
	    			}
	    		}
	    	}
	    }

	}


