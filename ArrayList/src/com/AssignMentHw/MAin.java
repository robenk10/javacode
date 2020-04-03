package com.AssignMentHw;

import java.util.ArrayList;

public class MAin {

	public static void main(String[] args) {
		
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		
		al.add(new Emp(10,"ajay",10));
		al.add(new Emp(101,"ajay",1005));
		al.add(new Emp(103,"ajayam",10232));
		al.add(new Emp(102,"bahao",112121));
		
		
		//In below toString in not override so we get only hashcode
		System.out.println(al.get(0));
		
		//emp sal >10000 print only emp name....
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).sal>10000)
			{
				System.out.println(al.get(i).name);
			}
		}
		
		
		System.out.println();
		//emp name is equal to ajay........
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).name.equalsIgnoreCase("ajay"))
			{
				System.out.println(al.get(i).name);
			}
		}
		
		//emp sal gretest display.....
		/*
		 * Emp e=null; for(int i=0;i<al.size();i++) { e=al.get(i); for(int
		 * j=i+1;j<al.size();j++) { if(e.sal<al.get(j).sal) { e=al.get(i); } } }
		 */
		
		Emp e=null;
		int max=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).sal>max)
			{
				max=al.get(i).sal;
			
			}
		}
		
		
		
		System.out.println(" "+max);
		
		
		
		
	}

}
