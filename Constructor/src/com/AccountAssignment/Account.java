package com.AccountAssignment;

public class Account {
//1//. /*Create a class Account with member Variable: long accountNo, String customerName.Make them public.*/

	public long accountNo;
	public String customerName;
	/************************************************************************************************************/

//3.// /*Create default constructor assign new value to all variables. Write SOP I am in default constructor*/

	
	  
	  Account() 
	  {
		  accountNo=10;
		  customerName="AJ";
	  System.out.println(accountNo+" "+customerName+" "); }
	 
	/***********************************************************************************************************/
//5.//
	/*
	 * Define a constructor which takes all arguments and assigns those values to
	 * the member variables. SOP I am in parameterized constructor
	 */

	Account(long a) {
		this.accountNo = a;
		System.out.println("I am in Parameterised constructor " + a);
	}

	/**********************************************************************************************************/
	// 6.//

	/*
	 * In main, to create another object of the Account class using the constructor
	 * with all arguments and print the member variable values.
	 */

	Account(long accountNo, String customerName) {
		this.accountNo = accountNo;
		this.customerName = customerName;
		System.out.println(accountNo + " " + customerName);
	}
	/************************************************************************************************************/

}
