package com.HwAssignment1;

import java.util.Scanner;

public class Test {
	
	public int display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int result=m1+m2;
		return result;
	}

	public static void main(String[] args) {
		
         Test t=new Test();
         int res=t.display();
         System.out.println(res);
	}

}
