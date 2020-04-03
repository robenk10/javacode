package com.TestNo3;

public class Question18 {

	public static void main(String[] args) {
		car c1=new car();
		c1.color="blue";
		car c2=new car();
		c2.changecolor(c1);
		c2.color="pink";
		System.out.println(c1.color);
		System.out.println(c2.color);
		
		

	}

}

class car 
{
	String color;
	public void changecolor(car c)
	{
		c.color=color;
		System.out.println(c.color);
		color="red";
		System.out.println(color);
	}
}
