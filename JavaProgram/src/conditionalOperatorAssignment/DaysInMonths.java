package conditionalOperatorAssignment;

import java.util.Scanner;

public class DaysInMonths
{

	public static void main(String[] args) 
	{
       // Write a Java program print total number of days in a month 
		// TODO Auto-generated method stub
		System.out.println("Enter the days to check how many days in months");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
       int jan=31;
       int feb=28;
       int march=31;
       //int april=30;
       int may=31;
      // int june=30;
       int july=31;
       int august=31;
     //  int sept=30;
       int oct=31;
     //  int nov=30;
       int dec=31;
       
       if(month==jan||month==march||month==may||month==july||month==august||month==oct||month==dec)
       {
    	   System.out.println("jan ,march,may,july,august,oct,nov month have 31 days in month");
       }
       else if(month==feb)
       {
    	   System.out.println("feb month have 28 or 29 days in month");
       }
       else if(month<28)
       {
    	   System.out.println("Invalid Input");
       }
       else
       {
    	   System.out.println("april,sept,nov month have 30 days in month");
       }
        
        
	}

}
