package com.ClassProgram;

class Test1
{   int n;
	public void valid(int n)
	{
		if(n<18)
		{
			throw new ArithmeticException ("Not valid Age");
		}
		else
		{
			System.out.println("valid");
		}
	}
	 
}

public class Demo4 {

	public static void main(String[] args) {
		
		Test1 t=new Test1();
	
	    try {
		t.valid(15);
	    }
		
	    catch(ArithmeticException e)
	    {  
	    	try
	    	{
	    	throw new ArithmeticException ("Not valid Age");
	    	//System.out.println(e.getMessage());
	    	}
	    	catch(Exception e1)
	    	{
	    		System.out.println(e1.getMessage());
	    	}
	    		
	    	
	    }
	    
	    System.out.println("Hello");
		

	}

}
