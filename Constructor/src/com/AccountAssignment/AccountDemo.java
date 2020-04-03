package com.AccountAssignment;

public class AccountDemo {

	public static void main(String[] args) {
	 
/*2//In main, create a new object of the Account class and print the member variables value.
Note – Default constructor is provided by Java to facilitate the creation of a new object.
Here variables are assigned default values*/
		
		
		Account a=new Account();
		System.out.print("sysout IN "+a.accountNo+" ");
		System.out.println(a.customerName);
		System.out.println("******************************************");
/*******************************************************************************************************************/

//4.//  
/*In main, create another object of the Account class and print the member variables
value. Note – Since you have defined a (default) constructor, Java does not provide
another one.*/
		
		//Account a1=new Account();
		//System.out.println(a1.accountNo);
		//System.out.println(a1.customerName);
		System.out.println("*******************************************");
/******************************************************************************************************************/
//5.//
/*. Define a constructor which takes all arguments and assigns those values to the member
variables. SOP I am in parameterized constructor*/
		
		Account a5=new Account(10);
		System.out.println("*********************************************");
/*****************************************************************************************************************/
//6.//
/*In main, to create another object of the Account class using the constructor with all
arguments and print the member variable values.*/
		
		Account a6=new Account(101235466,"custnme:-Ajay");
		System.out.println("*******************************************");
/********************************************************************************************************************/
//7.//
/*In main method, create 2 Account objects with different account numbers and names.
Then print the values of all the member variables of both the accounts.*/
		
		Account a7=new Account(12343913,"Robin Kedari");
		Account ap7=new Account(887878687,"Ajaya");
		System.out.println("************************************");
/*********************************************************************************************************************/
//8.//
/*From Account class, comment the default constructor with no arguments and try to

create an Account object by calling the default constructor. Note – If a non-default (non-
parameterized) constructor is present in the source code, Java will not provide a default

one. Hence you cannot do Account a = new Account();*/
		
		Account a8 = new Account();
		//getting error of no default constructor in class
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
