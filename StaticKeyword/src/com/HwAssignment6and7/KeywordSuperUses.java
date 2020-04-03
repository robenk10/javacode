package com.HwAssignment6and7;

public class KeywordSuperUses {

	int wheels=4;
  
	 public void show()
	 {
		 System.out.println("hi "+wheels);
	 }
	 
	 KeywordSuperUses()
	 {
		 System.out.println("hello all");
	 }
}

class Auto extends KeywordSuperUses
{
	int wheels=3;
	Auto ()
	{
		System.out.println("all hello");
	}
	public void show() {
		
		super.show();
		System.out.println(wheels);
		System.out.println(super.wheels); //can refer to parent class instance varibale
	}
}
