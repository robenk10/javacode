package com.ClassProgram; 

class Demo6
{   
	public void m1()
	{   
		String s=null;
		System.out.println(s.length());
		
		
		
	}
	public void n()
	{
		m1();
	}
	
	public void p()
	{
		try
		{
			n();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class ProbagationExcep {
   
	public static void main(String[] args) {
		
		Demo6 d=new Demo6();
		d.p();
		System.out.println("normal flow");

	}

}
