package com.ConstructorOverLoading;

public class A {

	public static void main(String[] args) {

		Demo d=new Demo(20);
		



	}   

}

class B {


}

class Demo extends B{


	Demo(int n)
	{
		System.out.println("Hii");
	}
}
