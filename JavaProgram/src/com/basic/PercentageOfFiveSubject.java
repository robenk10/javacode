package com.basic;

import java.util.Scanner;

public class PercentageOfFiveSubject {

	public static void main(String[] args) {
		
	  Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the five subject of marks out of 100");
         int phy=sc.nextInt();
		 int chem=sc.nextInt();
		 int math=sc.nextInt();
		 int Bio=sc.nextInt();
		 int IT=sc.nextInt();
	  
	 int total=phy+chem+math+Bio+IT;
	 float avg=total/5;
	 float percentage=total*100/500;
	 System.out.println("The Average of five subject is "+avg);
	 System.out.println("The percentage is"+percentage);

	}

}
