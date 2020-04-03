package com.janbatch;

import java.util.*;

public class Demo {

	public static void  m1(char c, ArrayList<String> al)
	{   
		System.out.println(al.size());

		String c1=c+"";
		for(int i=0;i<al.size();i++)
			
		{
			String s=al.get(i);
			System.out.println(al.get(i));
		   String s1[ ]=s.split(" + ");
		   System.out.println(s1[0]+" "+s1[1]);
		
		}
	}
	public static void main(String[] args) {
	//	Demo d = new Demo();
		ArrayList<String> al = new ArrayList<String>();
		al.add("A+5");
		al.add("b+6");
		al.add("D+7");
	    m1('D', al);
	// System.out.println(a);

	}
}
