package testOne;

import java.util.Scanner;

public class Ques_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x = sc.next().charAt(0);
		
		if(( x >= 'a' &&  x <= 'z') || (x >= 'A' &&  x <= 'Z'))
			System.out.println("Alphabate");
		
		else if(x == '#' || x == '+' || x == '!' || x == '@' ||x == '$' ||x == '%' ||x == '^' ||x == '&' )
			System.out.println("Special Character");
		else
			System.out.println("Digit");
	}

}
