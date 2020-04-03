package conditoinalOperatorswitchcaseAssignment;

import java.util.Scanner;

public class NumberOfDayInMonth {

	public static void main(String[] args) {
		
		// Write a Java program print total number of days in a month using switch case;
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number to know which month is that");
		 int day=sc.nextInt();
		 switch(day)
		 {
		 case 31:System.out.println("January \n march \n may \n july \n august \n october \n are 31 days months"); break;
		        
		 case 30:System.out.println("April \n June \n septeber \n November are 30 days in months");break;
		 case 28:System.out.println("February are 28 days in months");break;
		 case 29:System.out.println("February are 29 days and this is leap year");break;
		  default:System.out.println("invalid input");
		 
		 }
		 
		

	}

}
