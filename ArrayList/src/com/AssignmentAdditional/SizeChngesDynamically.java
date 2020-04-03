package com.AssignmentAdditional;

import com.ArrayListConsstructor.Demo;

public class SizeChngesDynamically {

	public static void main(String[] args) {
		
		Demo m=new Demo();
		m.al.add("yellow1");
		m
		.m("tqpp");
		
		
		System.out.println(m.al);
	    
		System.out.println(m.al.size());
		System.out.println(m.al.get(0));
		System.out.println(m.al.get(m.al.size()-1));
       
		m.al1.add("Monday");
		m.al1.add("Tuesday");
		m.al1.add("wenesday");
		m.al1.add("Thursday");
		m.al1.add("Friday");
		m.al1.add("Saturday");
		m.al1.add("Sunday");
		System.out.println(m.al1);
		
		for(int i=0;i<m.al1.size();i++)
		{
			String s=m.al1.get(i);
			int x=s.length();
			
			if(x>7)
			{
				m.al1.remove(i);
			}
		}
		
		System.out.println(m.al1);
	}

}
