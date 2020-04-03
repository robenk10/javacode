package com.MethodAssignments;

public class Arithmetic {
   int x,y;
   public void Operation(int a,int b)
   {
         System.out.println(x+y+" Addition");
         System.out.println(x*y+" multiplication");
         System.out.println(x/y+" division");
         System.out.println(x-y+" subtraction");
   }
	public static void main(String[] args) {
		
       Arithmetic a=new Arithmetic();
       a.Operation(a.x=5, a.y=5);
	}

}
