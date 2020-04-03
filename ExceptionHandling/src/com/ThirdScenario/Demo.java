package com.ThirdScenario;

class B extends A {
	int n = 1;

	public void get(int n)

	{

		super.n = this.n;

		if (super.n < n) {
               
			System.out.println("hello"+" "+1/0);
			throw new ArithmeticException("Exception Occur");

		}

		System.out.println(super.n + " " + n + " " + n);
	}
}

public class Demo {

	public static void main(String[] args) {

		A a = new B();
		
		try {
			a.get(15);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(a.n);
	}

}
