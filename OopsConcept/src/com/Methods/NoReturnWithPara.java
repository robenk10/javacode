package com.Methods;

import java.util.Scanner;

public class NoReturnWithPara {

	int a, b;

	public void add(int m, int n) // Formal Argument
	{
		a = m;
		b = n;
		System.out.println(a + b);
	}

	public void add(int x, float y) {
		System.out.println(a + b);
	}

	/*
	 * public void add(short c , short d)     //he method add(short, short) in the type
	 * {                                     //NoReturnWithPara is not applicable for the arguments (int, int) 
	 * System.out.println(c+d); }
	 */
	
	
	public void add(NoReturnWithPara dc1)
	{  
		 System.out.println(dc1);
	}

	public static void main(String[] args) {

		NoReturnWithPara dc = new NoReturnWithPara();

		Scanner sc = new Scanner(System.in);

		dc.add(12, 20); // actual argument

		System.out.println("Enter the value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		dc.add(a, b);
		System.out.println("Again enter the value");
		dc.add(sc.nextInt(), sc.nextInt());

		System.out.println("enter the value");
		dc.add(sc.nextInt(), sc.nextInt());

		System.out.println("enter the value a and b ");
		dc.a = 19;
		dc.b = 1;
		dc.add(a, b);
		dc.add(20, 40);
		dc.add(sc.nextInt(), sc.nextInt());
		dc.add(sc.nextInt(), sc.nextInt());
		
		dc.add(dc);
		System.out.println(dc);

	}
}
