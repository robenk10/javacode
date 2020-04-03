package com.CheckedException;

import java.io.IOException;

class A
  {
	  public void m(int n) throws IOException 
	  {
		  
		  throw new IOException("mismatch");
	  }
  }

public class CheckedExce {

	public static void main(String[] args) {
		
		A a=new A();
		try {
			a.m(20);
		} 
		
		catch(IOException e1)
		
		{
		    System.out.println(e1.getMessage());	
		}
		catch (Exception e) {
			
			
			System.out.println(e.getMessage());
		}

	}

}
