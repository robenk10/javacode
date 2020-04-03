package assignmentOneForOops;

import java.util.Scanner;

public class Question16 {
	
	String name;

	public static void main(String[] args) {
		
		
		/*
		 * National game of India is Hockey, China is Table Tennis, Bangladesh is Kabaddi, Italy is Football, 
           United States is baseball. Write a Java program to read country name as user-input and to print the 
             country’s national game. Use switch  
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the country name to check");
		
		Question16 q=new Question16();
		
		q.name=sc.next();
		
		switch(q.name)
		{
		case "india" :System.out.println("National game of India is Hockey");break;
		case "china":System.out.println("national game of chine is Tennis");break;
		case "italy":System.out.println("national game of Italy is Football");break;
		case "bangladesh":System.out.println("National game of bangladesh is kabbadi");break;
		case "united states":System.out.println("National game of usa is baseball");break;
		default:System.out.println("Invalid OUtput");
		
		}
		
		
		
		
	}

}
