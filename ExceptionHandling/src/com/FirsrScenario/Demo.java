package com.FirsrScenario;

import java.io.IOException;

class B extends A
{
	public void get() throws IOException
	{
		System.out.println("Hello Java");
		    
		  try
		  {
			super.get();
			throw new IOException("IOException Occurr");
		
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		
		
		
	}
}

public class Demo {

	public static void main(String[] args) throws IOException {
		
        B b=new B();
       
        try
        {
        	 b.get();
        }
        
        catch(Exception e)	{
        	
        	System.out.println(e.getMessage());
        	System.out.println("heeeewo");
        }
	}

}
