package com.ShowsArrayIndexOutOfBound;

public class Test {

	public static void main(String[] args) {
		
		 int [] arr=new int[4];
		 
		 try {
			
	         int a=10/0;
			 arr[5]=18; 
			 System.out.println(arr[5]);
		 
		 }
		 
         
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e.getMessage());
		 }
		 
		 catch(ArithmeticException e1)
		 {
			 System.out.println(e1.getMessage());
		 }
		 
	}

}
