package com.Assignment1;

public class A {
	
	static int b=787;
    static void foo(int a)
    {   
    	
    	System.out.println(a);
    }
  
    void foo(int a,int b)
    {
       System.out.println(a+" "+b);	
    }
}

 class B extends A
{  
	 
	 
	 static void foo(int a)
	 {
		 System.out.println("hi "+a);
	 }
	 public B() {
		System.out.println(b);
	}
}
 
 