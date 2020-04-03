package com.previousquetion;

public class LeapOrNot {

	public static void main(String[] args) {
		
		int year=2000;
		boolean isLeap=true;
		
		if(year%4==0 && year%100==0 && year%400==0) {
			
			isLeap=true;
		}
		else {
			isLeap=false;
		}
		
		if(isLeap) {
			System.out.println("leap year");
		}
		else {
			System.out.println("Not Leap year");
		}
	}

}
