package whileLoopingAssignment;

import java.util.Scanner;

public class CalculateProductOfDigit {

	public static void main(String[] args) {
		
		// Write a Java program to calculate product of digits of any number.
		
		  Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number");
	        int num=sc.nextInt();
	        int d,prod=1;
	        while(num!=0)
	        {
	        	d=num%10;
	            prod=prod*d;
	        	num=num/10;
	        }
	        System.out.println(prod + " is the product of that digit");

	}

}
