package com.ShowIndexOutOfBoundException;



class A
   {   
	   int [] a;
	   String str="java";
	   public void Array(int [] a)
	   {
		  this.a=a;
		  for(int i=0;i<a.length;i++)
		  {   
			  
			  System.out.println(a[i]);
		  }  
		   
		  
		  
			
			  throw new ArrayIndexOutOfBoundsException(a[3]=55);
		  
		  
	   }
	   
	   public void string()
	   {
		
		   System.out.println(str.charAt(4));
	   }
   }

public class Demo {

	public static void main(String[] args) {
		
		A a=new A();
		
		
		int [] b= {121,131,141};
		try
		{  
			a.string();
		    
	
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}
		 try
		 {
			 a.Array(b);
		 }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	

	}

}
