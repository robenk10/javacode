package com.ReturnIntValueIntryOrFinallyBlock;

class A{
	public int m()
	{ 
		try
		{    
			  int a=10/0;
			  return 10;
			  
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{  
			
			 // return 12;
			System.out.println("HIaalll");
		}
		
		System.out.println("helloee");
		return 18;
		
	  
		
	}
	public  String m11()
	{
		try
		{
			String s=null;
			System.out.println(s.length());
			return "from Fry";
			
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally {
			System.out.println("finally");
			
		}
		return null;
		
	}
}
public class Demo {
	public static void main(String[] args) {
		
		A a=new A();
		//System.out.println(a.m());
		System.out.println(a.m11());
	}

}
