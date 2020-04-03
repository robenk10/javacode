package com.TestNo3;

public class QuestionNo10 {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		System.out.println(d.show());
	}

}

class Animal{
	String name="animal";
	String makeNoise()
	{
		return "GEneric Noise";
	}
	
	
}

class Dog extends Animal
{
	String name;
	String show()
	{
		return name;
	}
	
}
