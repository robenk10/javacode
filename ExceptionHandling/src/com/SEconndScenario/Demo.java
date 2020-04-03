package com.SEconndScenario;

import java.io.IOException;

class B extends A
{
	public void  get()  throws ArithmeticException,NullPointerException, IOException
	
	{
		throw new IOException ("helle");
	}
}

public class Demo {

	public static void main(String[] args) {
	
          B b=new B();
         try 
         {
          b.get();
         }
         catch(Exception e)
         {
        	 System.out.println(e);
         }
	}

}
