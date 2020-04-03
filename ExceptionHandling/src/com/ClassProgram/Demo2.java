package com.ClassProgram;
class A1
{
	 public void show()
	   {
		   System.out.println("hi");
		   try
		   {
			   System.out.println(10/0);
			   System.out.println("hello");
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println(e.getMessage());
		   }
		   
		
		/*
		 * catch(Exception e) { System.out.println(e); }
		 */ //Parent never comes Before child 
		 
		   
	   }
}
public class Demo2 {
  
	public static void main(String[] args) {
		 A1 a=new A1();
		 a.show();
	}
}
