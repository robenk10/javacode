package com.Assignment1;

public class Car {
     static String model;
     static int totalcarsold;
     int carno;
	public static void main(String[] args) {
		Car.model="audi";
		Car.totalcarsold=20;
		System.out.println(Car.model+" "+Car.totalcarsold);
		
	   Car c=new Car();
	   
	   Car c1=new Car();
		/*
		 * c.model="bmw"; 
		 * c.totalcarsold=10;
		 * System.out.println(c.model+" "+c.totalcarsold);
		 */
	   //- The static field Car.totalcarsold should be accessed in a  static way
	   
	   
	   System.out.println(model);
	  // System.out.println(carno);  cannot access instance variable diretly
	   
	   
		
	}
}
