package com.ClassProgram;

class Test11
{
	public void show()
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			throw new NullPointerException ("String is empty");
		}
	}
}

public class RethrowingException {

	public static void main(String[] args) {
		
      Test11 s=new Test11();
       
      try
      {
    	  s.show();
      }
      catch(Exception e)
      {
    	  System.out.println(e.getMessage());
      }
      
      
      System.out.println("hi");
      
	}

}
