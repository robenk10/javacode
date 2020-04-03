package com.previousquetion;

public class PrintNumber100to500 {

	public static void main(String[] args) {
		
		for(int i=100; i<=500; i++) {
			
			 if(i%7==0 && i%11==0) {
					System.out.println("RajaSoftware");
				}
			 else if(i%7==0) {
				System.out.println("Raja");
			}
			else if(i%11==0) {
				System.out.println("softwere");
			}
		   
		}

	}

}
