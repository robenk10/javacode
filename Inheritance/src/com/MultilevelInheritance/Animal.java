package com.MultilevelInheritance;

public class Animal {
	
	void function()
	{
		System.out.println("following are Type of Animal");
	}

}

class Dog extends Animal{
	
	public void function()
	{
		System.out.println("Is pet and Protect Us from other or our homes");
	}
}

class BabyDog extends Dog{
	
	public void function()
	{
		System.out.println("sleeping and playing");
	}
}
