package com.Parentclass;

 abstract class Parent {
     int a;
	 abstract void cook();
	 
	 public void wash()
	 {
		 System.out.println("In parant wash method");
	 }
	 
	 Parent(int a)
	 {
		 this.a=a;
		 System.out.println(a);
	 }
}
 
 class Child extends Parent
 {

	Child(int a) {
		super(a);
		System.out.println("in child class class constructor");
	}

	@Override
	void cook() {
		System.out.println("In child class cook method");
		
	}
	 
 }
