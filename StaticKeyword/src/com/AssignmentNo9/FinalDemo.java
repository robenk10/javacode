package com.AssignmentNo9;

public  class FinalDemo {
  final int x;
  
 
  {
	 x=10;
	 System.out.println("ho"+" "+x);
  }
  
  private void m2()
  {
	  System.out.println("hello");
  }
  
  
  final public void m1()
  {
	  System.out.println("hi");
  }
	
}

final  class  FinalDemochild extends FinalDemo
{
	/*
	 * final public void m1() {
	 * 
	 * }
	 *///cannot override final method in child class
}
 
 class Demo
 {
	 public static void main(String[] args) {
		
		 
		 FinalDemochild fd=new FinalDemochild();
		 // fd.x=100; cannot assign final variable	}
		 fd.m1(); //can inherited final method in childclass...
		 //fd.m2();  cannot inherited private method in childclass..
 }
}