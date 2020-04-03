package com.DeepCopy;


public class Main {

	public static void main(String[] args) {
		
        Emp e=new Emp(18,"Robin",new Dept(15,"cse"));
		
		Emp e1 = null;
		
		try
		{
			e1=e.clone();
		}
		catch(CloneNotSupportedException n)
		{
			System.out.println(n.getMessage());
		}
		
		System.out.println(e.id);
		System.out.println(e1.id);
		e1.d.did=19;
		System.out.println(e.d.did);
		System.out.println(e1.d.did);
		
	}

}

