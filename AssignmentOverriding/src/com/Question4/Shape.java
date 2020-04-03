package com.Question4;

public class Shape {
     
	public void draw()
	{
		System.out.println("In Shape class  draw method");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("In Circle class Overidden draw method");
	}
}

class Square extends Shape
{
	public void draw()
	{
		System.out.println("In Sqaure class Overidden draw method");
	}
}

class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("In Rectangle class Overridden draw Method");
	}
}

