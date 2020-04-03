package com.AssignMentHw;

import java.util.ArrayList;
import java.util.Arrays;

public class Assig10 {

	public static void main(String[] args) {
		
		  
		ArrayList<Boolean> al=new ArrayList<Boolean>();
		
		al.add(true);
		al.add(false);
		al.add(false);
		
		
	   ArrayList<Boolean> al1=new ArrayList<Boolean>();
		
		  al1.add(false);
		  al1.add(false);
		  al1.add(true);
		
		al1.addAll(al);
		
		
		//System.out.println(al1);
		
		
//		Object x[] =al1.toArray();
//		System.out.println(Arrays.toString(x));
		boolean b1[]=new boolean[al.size()];
		for(int i=0;i<al.size();i++)
		{
			b1[i]=al.get(i);
		}
		
		
		Boolean b2[] =al1.toArray(new Boolean[al.size()]);
		
		for(int i=0;i<al1.size();i++)
		{
		    System.out.println(b2[i]);
		}
//		
		

	}

}
