package com.Assignment;

import java.util.ArrayList;
import java.util.Collections;

interface A
{
	default void m1()
	{
		System.out.println("hiii");
		
	}
	
	void m();
}

class B implements A
{  
	
    protected void m1( int n)
    {
    	
    	System.out.println("hi");
    }
    
  public  void m()
    {
    	
    }
}
public class Check {

	public static void main(String[] args) {
	 B a=new B();
      a .m1(10);
      
      
      ArrayList al=new ArrayList();
      
      al.add(12);
      al.add("ajay");
     al.add(1.2f);
     
     System.out.println(al.get(0));
      
     Collections.sort(al);
      System.out.println(al);
	    
		
		
         
         
         

	}

}
