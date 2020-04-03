package com.CheckExceptionQBySwetha;

public class Myclass {
	static String str="a";
	public static void main(String[] args) {
       new Myclass().m1();
		System.out.println(str);

	}

	void m1()
	{
		try
		{
			m2();

		}
		catch(Exception e)
		{
			str +="b";
		}
	}
	void m2() throws Exception
	{  try
	      {
		     m3();
		     str +="c";
	     }
	      catch(Exception e) 
	      {
	    	 throw new Exception();
	      }
	      finally
	      {
	    	  str +="d";
	      }
	      
	        str +="e";
	        m3();
	  
	}
	void m3() throws Exception
	{
        throw new Exception();
	}
}
