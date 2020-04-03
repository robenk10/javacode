package com.basic;

import java.util.Scanner;

public class CoumpoundInterest {

	public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	 double amount;
	 System.out.println("Calculate the compound Intrest");
	 System.out.println("enter the principle");
	 double principle=sc.nextDouble();
	 System.out.println("principle is "+principle);
	 
	 System.out.println("Enter the time");
	 double time=sc.nextDouble();
	 System.out.println("time  is "+time);
	 
	 System.out.println("Enter the rate");
	 double rate=sc.nextDouble();
	
	 
	 rate=(1+rate/100);
	 System.out.println("rate is "+rate);
	 
	 
	 double newRate=(double)Math.pow(rate ,time);
	 System.out.println("newRate is "+newRate);
	 
	 amount=principle*newRate;
	 System.out.println("amount is "+amount);
	 
	   double ci=amount-principle;
	 System.out.println("the compund intrest is "+ci);
	 
	 
	 

	}

	

	

}
