package com.Hierarchical;

public class Animal {
   int leg=4;
	void type()
	{
		System.out.println("leg");
	}
}


class Dog extends Animal
{
	void type()
	{
		System.out.println(leg);
	}
}


class Cat extends Animal
{
	void type()
	{
		System.out.println("leg");
	}
}
