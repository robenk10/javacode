package conditionalOperatorAssignment;

import java.util.Scanner;

public class NumberischarAlphaAndspecChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Write a Java program to input any character and check whether it is alphabet, digit or special character  
		
	    System.out.println("Enter the Character to check alphabet , digit or special cha");
	    Scanner sc=new Scanner(System.in);
	    
	    char ch=sc.next().charAt(0);
	    for(int i='A';i<='z';i++)
	    {
	    	if(ch=='i')
	    	{
	    		System.out.println("this is alphabet");
	    	}
	    }
	    
	    for(int j=0;j<=9;j++)
	    {
	    	if(ch=='j')
	    	{
	    		System.out.println("this is Digit");
	    	}
	    }
	   
	}

}
