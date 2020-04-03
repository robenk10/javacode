package com.MethodAssignments;

public class ArithmeticForAll {
	int a, b;

	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		ArithmeticForAll a = new ArithmeticForAll();
		System.out.println(a.add(a.a = 8, a.b = 9));
		System.out.println(a.sub(a.a = 8, a.b = 9));
		System.out.println(a.mul(a.a = 8, a.b = 9));
		System.out.println(a.div(a.a = 8, a.b = 9));

	}

}
