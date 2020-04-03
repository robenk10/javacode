package conditionalOperatorAssignment;

import java.util.Scanner;

public class YearisLeapOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.// . Write a Java program to check whether a year is leap year or not  
        System.out.println("Enter the Year in Number");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        
        //Using Ternary
        String str=(year%4==0)?"This is leap year":"This is Not leap Year";
        System.out.println(str);
        
        //Using If else
        if(year%4==0)
        {
        	System.out.println("This is Leap Year");
        }
        else
        {
        	System.out.println("This is not Leap year");
        }
	}

}
