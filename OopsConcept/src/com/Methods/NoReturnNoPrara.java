package com.Methods;

import java.util.Scanner;

public class NoReturnNoPrara {
	
	int a,b;

	public void add()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {

		//try out of class lecture
		Scanner sc=new Scanner(System.in); 


		NoReturnNoPrara  dc=new NoReturnNoPrara ();

		  // NO RETURN TYPE NO PARAMETER();
		  
		  
		  System.out.println("Enter the value");
		  dc.a=sc.nextInt(); 
		  dc.b=sc.nextInt();
		  dc.add();
		  
		  dc.a=10; dc.b=20; dc.add();
		 
	}

}
