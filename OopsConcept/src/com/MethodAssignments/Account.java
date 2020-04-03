package com.MethodAssignments;

public class Account {
	
	int accNo;
	String name;
	static float amount;

	public void insert(int a,String nm,float am) {
       
		accNo=a;
		name=nm;
		amount=am;
		display();
		
	}

	public void display() {
     
		System.out.println(accNo+" "+name+" "+amount);
		deposit(amount);
	}

	public float deposit(float dep) {
		System.out.println("amount is deposit in your account::"+dep);
		return amount;

	}

	public float withdraw(float withdraw) {
        
		amount=amount-withdraw;
		return checkBalance(amount);
		
	}
	
	public float checkBalance(float finl) {
		return finl;
		 
		
		
	}

	public static void main(String[] args) {

		Account ac = new Account();
		ac.insert(343014888, "ajayrao", 110000);
		//ac.deposit(10000);
		ac.withdraw(25000);
		
		float fnlbalce=ac.checkBalance(amount);
		System.out.println("Final balance is::"+fnlbalce);
		
    
	}

}
